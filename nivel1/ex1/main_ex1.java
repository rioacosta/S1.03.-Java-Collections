package nivel1.ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class main_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String answer = "";
		
		Month[] monthsName = {new Month("January"), new Month("February"), new Month("March"),
                new Month("April"), new Month("May"), new Month("June"),
                new Month("July"), new Month("September"), new Month("October"),
                new Month("November"), new Month("December")};

		List<Month> months = new ArrayList<>(Arrays.asList(monthsName));
		
		System.out.println(months.toString());
		
		months.add(7, new Month ("August"));
		
		System.out.println(months.toString());
		
		HashSet<Month> monthSet = new HashSet<>(months);
        
        System.out.println("\nHashSet size: " + monthSet.size() + "\n");
        
        
        Month duplicate = new Month("January");
        boolean added = monthSet.add(duplicate);
        System.out.println("the new month has been added? " + added);
        System.out.println("HashSet size: " + monthSet.size() + "\n"); 
        if (added) {
        	months.add(duplicate);
        }
        
        Month madeOff = new Month ("ImaginaryMonth");
        boolean added1 = monthSet.add(madeOff);
        if (added1) {
        	months.add(madeOff);
        }
        System.out.println("the new month has been added? " + added1);
        System.out.println("HashSet size: " + monthSet.size() + "\n");
        
        for (Month month: months) {
        	answer += month + "\n";
        }
        System.out.println(answer);
	}
}
