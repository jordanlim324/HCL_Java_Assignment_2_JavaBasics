
public class HCL_Java_Assign_2_JavaBasics_Q03 {

	public static void main(String[] args) {
		/*
		 * 3. Print the given number (command line argument) is even or odd.
		 */
		
		int i = Integer.parseInt(args[0]); // Should be set to 55
		
		if (i % 2 == 0) {
			System.out.println("The number set is an even number.");
		}
		else {
			System.out.println("The number set is an odd number.");
		}
		
	}

}
