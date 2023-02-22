package basics;

public class Substring {

	public static void main(String[] args) {
		
		// Given 2 int values. return true if one is negative and the other one is positive. 
		//exccept if the parameter negative is true then return true only if both are negative

		int rr =-1;
		int ff= 2;
		
		if(rr<0 && ff>0 || rr <0 && ff<0 ) {
			System.out.println(true);
		}else
			System.out.println(false);
	}

}
