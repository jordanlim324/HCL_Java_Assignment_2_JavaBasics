
public class HCL_Java_Assign_2_JavaBasics_Q11 {

	public static void main(String[] args) {
		/*
		 * 11. Iterate for loop from 50 to 100, and using break statement 
		 * print only even numbers until 75.
		 */
		int i = 50;
		for( ; i <= 100; i++) {
			if ((i % 2 == 0) && (i != 75)) {
				System.out.println(i);
			}
			if(i == 75) {
				break;
			}
		}
		
	}

}
