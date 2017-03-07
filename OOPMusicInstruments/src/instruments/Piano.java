package instruments;

public class Piano extends MusicInstrument {

	public Piano(double price, int haveInStack, String type) {
		super("Klavishni", price, haveInStack, type);
	}
	public Piano(String name){
		super("Klavishni", name);
	}

}
