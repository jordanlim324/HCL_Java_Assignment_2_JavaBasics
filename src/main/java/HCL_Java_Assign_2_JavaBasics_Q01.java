
public class HCL_Java_Assign_2_JavaBasics_Q01 {

	public static void main(String[] args) {
		/*
		 * 1. Take couple of variables (like int=1, j=5) and do
		 * Arithmetic
		 * Unary
		 * Relational and
		 * Logical Operation
		 */
		
		//Arithmetic
		int i = 1;
		int j = 5;
		
		int k = i*j;
		System.out.println(k);
		
		//Unary
		int x = 15;
		i++;
		System.out.println(i);
		--i;
		System.out.println(i);
		
		//Relational
		double a = 6.7;
		double b = 5.8;
		if (a >= b) {
			System.out.println("a is greater than or equal to b");
		}
		else {
			System.out.println("a is less than b");
		}
		
		//Logical Operation
		int c = 20;
		int d = 55;
		if(c % 2 == 0 || d % 2 == 0) {
			System.out.println("At least one number is divisible by 2.");
		}
		
	}

}
