package nivel1.ex1;

public class Month {
	private String name = "";
	
	public Month (String name) {
		 this.name = name;
	}
	
	public void getName () {
		this.name = name;
	}
	
	public void Name (String name) {
		this.name = name;
	}
	
    public boolean equals(Object o) {
        if (this.name == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Month month = (Month) o;
        return name.equals(month.name); 
    }

    public int hashCode() {
        return name.hashCode(); 
    }
    public String toString () {
		return this.name;
	}
}
