package instruments;

public class Sintezator extends MusicInstrument {

	public Sintezator( double price, int haveInStack, String type) {
		super("Elektronni", price, haveInStack, type);
	}
	public Sintezator(String name ){
		super("Elektronni", name);
	}


}
