
public class HCL_Java_Assign_2_JavaBasics_Q02 {

	public static void main(String[] args) {
		/*
		 * 2. Take command line argument and check whether it is odd or even
		 * using an if statement
		 */
		
		int i = Integer.parseInt(args[0]); // Should be set to 40
		
		if (i % 2 == 0) {
			System.out.println("int i is an even number.");
		}
		else {
			System.out.println("int i is an odd number.");
		}
		
	}

}
