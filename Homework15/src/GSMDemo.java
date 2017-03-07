
public class GSMDemo {
public static void main(String[] args) {
	GSM myPhone =new GSM();
	GSM pollyPhone =new GSM();
	myPhone.insertSimCard("0885417777");
	pollyPhone.insertSimCard("0886781021");
	myPhone.call(pollyPhone, 4.5);
	myPhone.printInfoForTheLastOutgoingCall();
	pollyPhone.printInfoForTheLastIncomingCall();
	myPhone.printInfoForTheLastIncomingCall();
	System.out.printf("I have to pay %.2f.\n", myPhone.getSumForCall());
	System.out.printf("Polly has to pay %.2f.\n",pollyPhone.getSumForCall());
	
}
}
