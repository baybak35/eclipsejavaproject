import java.util.Scanner;

public class UserInout {

	public static void main(String[] args) {
				
		Scanner batuhan = new Scanner(System.in);
			  //scanner
		System.out.println("Enter a byte value");
		byte b1 = batuhan.nextByte();
		System.out.println("My byte value is "+ b1);
		
		System.out.println("enter a short value");
		short s1 = batuhan.nextShort();
		
		System.out.println("Enter a int value");
		int i1 = batuhan.nextInt();
		
		System.out.println("Enter a boolean value");
		boolean bool = batuhan.nextBoolean();
		
		System.out.println(b1+ "|" + s1+ "|" + i1 + "|" + bool);
		
		batuhan.nextLine(); //this is to skip it from int to String
		
		System.out.println("Enter your name");
		String str = batuhan.nextLine();
		System.out.println(str);
		
		
		batuhan.close();
		
		
		
		
	}

}
