
public class HCL_Java_Assign_2_JavaBasics_Q04 {

	public static void main(String[] args) {
		/*
		 * 4. For a given number integer, print in the words using 
		 * a switch statement 1 to 10.
		 * Ex) If input is 5, then it should print "Five".
		 */
		
		int number = 10;
		String numString = null; 
		
		switch(number) {
			case 1: numString = "One";
			break;
			case 2: numString = "Two";
			break;
			case 3: numString = "Three";
			break;
			case 4: numString = "Four";
			break;
			case 5: numString = "Five";
			break;
			case 6: numString = "Six";
			break;
			case 7: numString = "Seven";
			break;
			case 8: numString = "Eight";
			break;
			case 9: numString = "Nine";
			break;
			case 10: numString = "Ten";
			break;
		}
		
		System.out.println(numString);
		
	}

}
