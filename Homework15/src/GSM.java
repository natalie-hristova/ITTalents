import java.text.DecimalFormat;

public class GSM {
	String model;
	boolean hasSimCard;
	String simMobileNumber = null;
	double outgoingCallsDuration = 0;
	Call lastIncomingCall;
	Call lastOutgoingCall;

	void insertSimCard(String newSimMobileNumber) {
		if (newSimMobileNumber.startsWith("08") && newSimMobileNumber.length() == 10) {
			simMobileNumber = newSimMobileNumber;
			hasSimCard = true;
		} else {
			System.out.println("Invalid number!");
		}
	}

	void removeSimCard() {
		hasSimCard = false;
		simMobileNumber = null;
	}

	// call( receiver, duration)
	void call(GSM receiver, double duration) {
		// дали въведената дължина на разговора е валидна
		if (duration >= 0) {
			// дали двата телефона (този за който се извиква метода и
			// този към който се прави обаждането) не са един и същ телефон
			if (!(simMobileNumber.equals(receiver.simMobileNumber))) {
				// дали и двата телефона имат сим карта
				if (hasSimCard && receiver.hasSimCard) {
					outgoingCallsDuration += duration;
					Call call = new Call();
					call.duration = duration;
					call.caller = this;
					call.receiver = receiver;
					lastOutgoingCall = call;
					receiver.lastIncomingCall = lastOutgoingCall;
				}
			}
		}
	}

	double getSumForCall() {
		// round the minutes to up
		return Call.priceForAMminute * Math.ceil(outgoingCallsDuration);
	}

	void printInfoForTheLastOutgoingCall() {
		if (lastOutgoingCall== null){
			System.out.println("There is not last outgoing call!");
		}
		else{
		System.out.println("The last outgoing call is from " + lastOutgoingCall.caller.simMobileNumber + " and is with "
				+ lastOutgoingCall.duration + " mins duration.And it is to "
				+ lastOutgoingCall.receiver.simMobileNumber);
			}
	}

	void printInfoForTheLastIncomingCall() {
		if (lastIncomingCall ==null) {
			System.out.println("There is not any incoming calls!");
		}else{
		System.out.println("The last incoming call is from " + lastIncomingCall.caller.simMobileNumber + " and is with "
				+ lastIncomingCall.duration + " mins duration.And it is to "
				+ lastIncomingCall.receiver.simMobileNumber);
			}
	}
}
