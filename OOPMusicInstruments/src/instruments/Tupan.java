package instruments;

public class Tupan extends MusicInstrument {

	public Tupan( double price, int haveInStack, String type) {
		super("Udarni", price, haveInStack, type);
	}

	public Tupan(String name){
		super("Udarni", name);
	}

}
