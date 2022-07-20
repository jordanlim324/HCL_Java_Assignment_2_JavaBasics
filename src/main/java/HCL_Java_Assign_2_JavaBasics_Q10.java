
public class HCL_Java_Assign_2_JavaBasics_Q10 {

	public static void main(String[] args) {
		/*
		 * 10. Iterate for loop from 1 to 100, and using continue statement 
		 * print only odd numbers.
		 */
		
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}
		
	}

}
