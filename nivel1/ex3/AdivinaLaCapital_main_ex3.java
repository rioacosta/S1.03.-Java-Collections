package nivel1.ex3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AdivinaLaCapital_main_ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader countries = null;
		BufferedReader reader = null;
		FileWriter userArchive = null;
		PrintWriter userScore = null;
		HashMap<String, String> countriesMap = new HashMap<>();
		Scanner userInput = new Scanner(System.in);
		String name = "";
		String answer = "";
		int score = 0;
		int chances = 10;
		
		try { 
			countries = new FileReader("C:\\Users\\Rio\\Desktop\\Fundamentos de la programacion\\countries.txt");
			
			if (countries.ready()) {
				reader = new BufferedReader(countries);
				String line;
				while ((line = reader.readLine()) != null) {
					String[] parts = line.split(" "); 
	                if (parts.length == 2) {
	                	countriesMap.put(parts[0].trim(), parts[1].trim());
	                }
					
				}
			} else {
				System.out.println("No esta listo para ser leido");
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		System.out.println("Juguemos a adivinar la capital, tienes 10 oportunidades."
				+ "\nComo te llamas?");
		name = userInput.next();
		
		do {	
			ArrayList<String> justCountries = new ArrayList<String>(countriesMap.keySet());
			int random = (int)(Math.random() * 51) + 1;//System.out.println(justCountry);
			String randomCountry = justCountries.get(random);
			System.out.println("Dime la capital de " + randomCountry);	
			answer = userInput.next();
			
			if (answer.equalsIgnoreCase(countriesMap.get(randomCountry))) {
				System.out.println("Correcto");
				score++;
			} else {
	            System.out.println("Incorrecto. La capital de " + randomCountry + " és " + countriesMap.get(randomCountry));
	        }
			
			try {
				userArchive = new FileWriter("C:\\Users\\Rio\\eclipse-workspace\\1.3-Sprint1-S1.03\\userArchive.txt");
				userScore = new PrintWriter (userArchive);
				
				userScore.println("El jugador " +name+ " logro una puntuacion de : "+ score);
				
			} catch (Exception e) {
				System.out.println("Error: " + e.getMessage());
			} finally {
				userScore.close();
			}
		chances --;
		
		} while (chances > 0);
		
		System.out.println(name + " tu puntuacion es : " + score);
	}
}
