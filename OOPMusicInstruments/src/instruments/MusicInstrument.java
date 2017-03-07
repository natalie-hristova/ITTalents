package instruments;

public abstract class MusicInstrument implements Comparable<MusicInstrument>{

	private String name;
	private double price;
	private int number;
	private String type;


	public MusicInstrument(String type , double price, int haveInStack, String name) {
		this.name = name;
		this.price = price;
		this.number = haveInStack;
		this.type = type;
	}
	
	public MusicInstrument(String type,String name ){
		this.type= type;
		this.name = name;
		
	}
	@Override
	public String toString() {
		return name+": "+ price+ " num:"+ number; 
	}
	@Override
	public int compareTo(MusicInstrument arg0) {
		return (int)(this.price*100- 100*arg0.getPrice());
	}
	
	public double getPrice(){
		return price;
	}
	public String getType(){
		return type;
	}
	public String getName(){
		return name;
	}
	public int getNumber(){
		return number;
	}
	public void setNumber(int i) {
		if (number>=0) {
			this.number = i;
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj== null) {
			return false;
		}
		if(obj instanceof MusicInstrument){
			return (((MusicInstrument) obj).getName()).equals(this.getName());
		}
		return false;
	}
}
