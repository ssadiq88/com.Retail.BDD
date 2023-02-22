package stringsMapulation;

public class PracticeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String myText = "abcdefg";
		
		String myText2 = "ABCDEFG";
		
		System.out.println(myText.toUpperCase());
		System.out.println(myText2.toLowerCase());
		System.out.println("---------------------------------");
		
		// two method isBlank() and is Empty()
		
		String test = " ";
		//this method tell us if the lenght of the string is zero
		System.out.println(test.isEmpty()); //space is a caracter because it has a unicode
		
		
		// the below method will return true if the String is blank regardless of space
		//why we would sue these method?
		//when riting prog that ask user to enter their name
		System.out.println(test.isBlank()); 
		
		
		
		
	}

}
