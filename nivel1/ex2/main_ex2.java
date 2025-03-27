package nivel1.ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class main_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbersAscendent =  Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80);
	
		ArrayList<Integer> numbersDescendent = new ArrayList<Integer>();
		
		System.out.println("Integer list #1" + numbersAscendent); 
		
		ListIterator<Integer> iterator = numbersAscendent.listIterator(numbersAscendent.size());
		int aux = iterator.previousIndex() +1;
		
		for (int i = 0; i < aux; i++) {
			numbersDescendent.add(iterator.previous());
			}
		
		System.out.println("Integer list #2" + numbersDescendent);
	}

}
