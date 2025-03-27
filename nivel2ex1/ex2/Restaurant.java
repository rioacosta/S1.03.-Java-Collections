package nivel2ex1.ex2;

import java.util.Objects;

public class Restaurant {
	private String name = "";
	private int rating = 0;
	
	public Restaurant (String name, int rating) {
		this.name = name;
		this.rating = rating;
	}
	
	public String getName () {
		return this.name;
	}
	public int getRating () {
		return this.rating;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, rating);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Restaurant other = (Restaurant) obj;
		return Objects.equals(name, other.name) && rating == other.rating;
	}
	
	 public String toString () {
		 return "El restaurante " + this.name + " calificacion: " +this.rating;
	 }
	
}