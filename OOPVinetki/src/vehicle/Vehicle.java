package vehicle;

import vinetki.Vinetka;

public class Vehicle {

	private String model;
	private Vinetka.TypeVehicle vinetkaType;
	private int year;
	private Vinetka vinetka;

	public enum TypeVehicle {
		CAR, BUS, TRUCK
	
	}

	private TypeVehicle type;

	public Vehicle( TypeVehicle type){
		this.type= type;
		decideVinetkaType();
	}

	public Vehicle(String model, int year, TypeVehicle type) {
		this(type);
		this.model = model;
		this.year = year;
	
	}

	private void decideVinetkaType(){
		switch (type) {
		case BUS:
			this.vinetkaType= Vinetka.TypeVehicle.BUS;
			break;
		case CAR:
			this.vinetkaType= Vinetka.TypeVehicle.CAR;
			break;
		case TRUCK:
			this.vinetkaType= Vinetka.TypeVehicle.TRUCK;
			break;
		default:
			break;
		}
		
	}
	public Vinetka.TypeVehicle  getVinetkaType() {
		return this.vinetkaType;
	}
	
	public void setVinetka(Vinetka vinetka){
		this.vinetka = vinetka;
	}
	public TypeVehicle getType(){
		return type;
	}

	public Vinetka getVinetka() {
		return this.vinetka;
	}
	
}
