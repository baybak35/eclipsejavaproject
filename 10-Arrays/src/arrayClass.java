import java.util.Arrays;
import java.util.Scanner;

public class arrayClass {

	public static void main(String[] args) {
		
		int [] myIntArray = new int [10];
		myIntArray[0]=35;
		myIntArray[1]=30;
		
		int[] myIntArray2 = {1,20,30,4,5};
		System.out.println(myIntArray2[2] + "|" + myIntArray2[4]);
		
		System.out.println("----------------------------");
		
		int[] myIntegers = getIntegers(3);
		System.out.println("The average is: " + getAverage(myIntegers));
		
		System.out.println(Arrays.toString(myIntegers));
	}
	//create a method - getIntegers
	
	public static int[] getIntegers(int number) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] array = new int[number];
		int count = 0;
		
		for(int i=0 ; i<array.length ;i++) {
			System.out.println("Enter number"+(i+1));
			array[i]=scanner.nextInt();
			
		}
		return array;
	}
	
	//method
	public static double getAverage(int[] arr) {
		int sum = 0;
		for(int i=0 ; i<arr.length; i++) {
			sum = sum + arr[i];
		}
		double ave = (double)sum/arr.length;
		return ave;
		
	}
	

}
