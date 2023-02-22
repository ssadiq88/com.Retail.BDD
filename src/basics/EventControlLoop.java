package basics;

import java.util.Scanner;

public class EventControlLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String password = "pass123";
		
		Scanner sn = new Scanner (System.in);
		
		System.out.println("Please enter you password");
		
		String input = sn.next();
		
		while (input.equals(password)== false) {
			System.out.println("try agian");
			input = sn.next();
		}
		System.out.println("correct");
	}

}
