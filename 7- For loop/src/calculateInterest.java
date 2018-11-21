
public class calculateInterest {

	public static void main(String[] args) {
		//How much is the interest rate for the amount of $10000 and %2 interest rate
		System.out.println(	calculateInterest(10000, 2) );
		//How much is the interest rate for the amount of $10000 and %3 interest rate
		System.out.println(	calculateInterest(10000, 3) );
		//How much is the interest rate for the amount of $10000 and %4 interest rate
		System.out.println(	calculateInterest(10000, 4) );
		//How much is the interest rate for the amount of $10000 and %5 interest rate
		System.out.println(	calculateInterest(10000, 5) );
		
		System.out.println("--------------------------------");
		
		for(int i=2; i<6; i++) {
			System.out.println( calculateInterest(10000, i) );
		}



		
		
	}
	
	public static double calculateInterest(double amount, double interestRate) {
		return amount * (interestRate/100);
	}

}
