
public class HCL_Java_Assign_2_JavaBasics_Q09 {

	public static void main(String[] args) {
		/*
		 * 9. Print prime numbers from 1 to 100
		 */
		
		for (int i = 1; i <= 100 ; i++) {
			
			boolean primeBool = true;
			
			for(int j = 2 ; j < i; j++) {
				if (i % j == 0) {
					primeBool = false;
					break;
				}
			
			}
			if (primeBool) {
				System.out.println(i);
			}
		}
		
	}

}
