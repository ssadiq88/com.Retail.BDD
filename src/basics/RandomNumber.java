package basics;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		int start =10;
		int end =33;
		
		Random r = new Random();
		 int numbervllue = r.nextInt(end - start + 1) + start;
		 
		 boolean guess = false;
		 while (guess == false ) {
			 System.out.println(" Enter a value");
			 int input = sc.nextInt();
			 
			 if (input > numbervllue) {
				 System.out.println("Go Down");
			 } else if (input <numbervllue) {
				 System.out.println("Go Up");
				 
			 }else {
				 System.out.println("correct, the value was" + input);
				 guess = true;
			 }
		 }
		 System.out.println("Thansk for playing, try agian");
		 
		 

}

	
}
