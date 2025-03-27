package nivel2ex1.ex2;

import java.util.Comparator;

public class RestaurantComparator implements Comparator<Restaurant> {
	public int compare(Restaurant r1, Restaurant r2) {
        int nameComparison = r1.getName().compareTo(r2.getName());
        if (nameComparison != 0) {
            return nameComparison;
        }
        return Integer.compare(r2.getRating(), r1.getRating()); 
    }
	
}
