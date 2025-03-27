package nivel2ex1.ex2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashSet<Restaurant> restaurants = new HashSet<Restaurant>();
		 restaurants.add(new Restaurant("Restaurant Can Primer", 4)); 
		 restaurants.add(new Restaurant("Restaurant Alba", 3));
		 restaurants.add(new Restaurant("Restaurant El Maño", 2)); 
		 restaurants.add(new Restaurant("Restaurant Bistro Bueno", 5));
		 restaurants.add(new Restaurant("Sushi Express", 4));
		 restaurants.add(new Restaurant("Restaurant El Maño", 5));	
		 restaurants.add(new Restaurant("Restaurant El Maño", 2)); 
		

	        System.out.println("Lista original:");
	        for (Restaurant restaurant : restaurants) {
	            System.out.println(restaurant);
	        }

	        TreeSet<Restaurant> listComparator = new TreeSet<Restaurant>(new RestaurantComparator());
	        listComparator.addAll(restaurants);
	        
	        ArrayList<Restaurant> newListTreeSetToArray = new ArrayList<Restaurant>(listComparator);
	        
	        System.out.println("\nLista ordenada:");
	        for (Restaurant restaurant : newListTreeSetToArray) {                  
	            System.out.println(restaurant);
	        }
	     
	     
	        
	    }
	}

