package oppsConsept;

public class StaticInterview {

	public static void main(String[] args) {
		
		// you are given a string take first and last char of eahc word and return the 
		//this sample string is given tp meothd 
		// ts se sg is gn  to a md
		String input = "This sample String is given to a meothd";
		System.out.println(processString(input));
	}
		public static String processString(String str ) {
			String res = "";
			
			String [] words = str.split(" ");
			for ( String s :words) {
				res += s.charAt(0) + ""+ s.charAt(s.length()-1)+ " " ;
			}
				
	
				
			
			return res;
			
		}
	

	}


