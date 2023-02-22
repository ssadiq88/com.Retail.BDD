package basics;

public class EachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String []countries= {"Brazil", " India", "Afghnistan", "US"};
		
		//1 in for loop after colen put name of your array in the right side 
		//2 in the left side of your array decleare a varaible of your array type which is now String
		
		for (  String str  : countries   ) {
			
			if (str.startsWith("U")) {
				System.out.println(str);
			}
			
		}

}
}