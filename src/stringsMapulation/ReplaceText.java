package stringsMapulation;

public class ReplaceText {

	public static void main(String[] args) {
		
		String replace= "there's Firf my some firf text";
		
		System.out.println(replace.replaceAll("e", "Z"));

		System.out.println("----------------");
		
		String bs = "Apple";
		String ss = "apple";
		System.out.println(bs.compareToIgnoreCase(ss));
		
		System.out.println(replace.concat(ss));
		
		int x = 30;
	
		char [] chars =bs.toCharArray();
		if(x<bs.length()) {
			System.out.println(chars[x]);
			
				
			
		}
		
		
	}

}
