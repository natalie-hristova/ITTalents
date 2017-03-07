import instruments.Daire;
import instruments.MusicInstrument;
import shop.Shop;

public class Demo {
	public static void main(String[] args) {
		
		Shop shop = new Shop();
	//	shop.orderedByType();
		MusicInstrument x=new Daire( "The daire");
		MusicInstrument y=new Daire(300, 3, "Red Daire");
		shop.sellInstrument(y, 2);
		shop.sellInstrument(y, 4);
//		shop.sellInstrument(x, 2);
//		shop.sellInstrument(x, 2);
//	shop.getNewInstruments(x, 2);
//shop.orderedByType();
		shop.orderedAlphabetically();
//	shop.orderedByType();
		//shop.orderedByPrice();
//	shop.onlyInStack();
		
	}

}
