package instruments;

public class Daire extends MusicInstrument {

	public Daire( double price, int haveInStack, String type) {
		super("Udarni", price, haveInStack, type);
	}

	public Daire(String name){
		super("Udarni", name);
	}
}
