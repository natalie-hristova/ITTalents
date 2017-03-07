package vinetki;

import java.time.LocalDate;
import java.time.Period;


public class Vinetka implements Comparable<Vinetka>{
	public enum Term {
		DAY(1), MONTH(10), YEAR(6);
		private int price;

		Term(int price) {
			this.price = price;
		}
	}

	public enum TypeVehicle {
		CAR("Blue", 5), BUS("Green", 9), TRUCK("Yellow", 7);
		private String color="g";
		private int price=0;

		TypeVehicle(String color, int price) {
			this.color = color;
			this.price = price;
		}
	}

	private LocalDate ussueDate;
	//private String color;// to si vyrvi s type
	private TypeVehicle type;
	private Term term;

	public Vinetka(  Term term, TypeVehicle type) {
		this.term = term;
		this.type = type;
		this.ussueDate= LocalDate.now();
	}

	public int stickOnWindow() {
		switch (this.type) {
		case CAR:
			return 5;
		case BUS:
			return 20;
		case TRUCK:
			return 10;
		default:
			return 0;
		}
	}

	public double takePrice() {
		return type.price * term.price;
	}

	@Override
	public int compareTo(Vinetka v) {
		return (int )(100*(takePrice()-v.takePrice()));
	}

	public boolean isVaid(LocalDate date) {
		switch (term) {
		case DAY:
			return (ussueDate.isAfter(date));
		case MONTH:
			return (ussueDate.plus(Period.ofMonths(1)).isAfter(date));

		case YEAR:
			return (ussueDate.plus(Period.ofYears(1)).isAfter(date));
		default:
			break;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return this.type.color + " - "+ takePrice();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((term == null) ? 0 : term.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
	//	result = prime * result + ((ussueDate == null) ? 0 : ussueDate.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vinetka other = (Vinetka) obj;
		if (term != other.term)
			return false;
		if (type != other.type)
			return false;
		if (ussueDate == null) {
			if (other.ussueDate != null)
				return false;
		} else if (!ussueDate.equals(other.ussueDate))
			return false;
		return true;
	}
	
	
}
