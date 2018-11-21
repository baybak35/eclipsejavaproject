import java.util.Scanner;

public class task {

	public static void main(String[] args) {
		
		Scanner scanner  = new Scanner(System.in);
		int sum=0;
		int counter=1;
		
		while(counter<11) {
			System.out.println("enter your number"+counter);
			boolean bool = scanner.hasNextInt();
			
			
			if(bool) {
				counter++;
				int number = scanner.nextInt();
				sum = sum + number;
			}else {
				System.out.println("Invalid number");
			}
			
			
			//scanner.nextLine();
		}
		System.out.println("Sum of all the numbers is"+sum);
		scanner.close();
	}
	

}
