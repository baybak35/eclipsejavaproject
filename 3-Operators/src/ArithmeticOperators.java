
public class ArithmeticOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i1 = 12;
		int i2 = 5;
		float f1 = 15.5f;
		double d1 = 20.5;
		String msg = "Hello";
		
		
		int res1 = i1+i2;
		float res2 = i1+f1;
		double res3 = i2 + d1;
		String res4 = msg + f1;
		
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		System.out.println(res4);
		
		System.out.println("-------------------------------");
		
		byte b1 = 12; //Implicit casting
		int ii1 = 12;
		byte b2 = 20;
		
		/*the result of an expression involving anything integer-sized 
		 * or smaller variable is always an integer.
		 * If you add two bytes together, you will get an integer.
		 * and in case of arithmetic addition adds, multiplication subs and division of integral variables(byte or short)
		 * compile processes the value as integer, 
		 * so you need to cast it
		 */
		
		byte resByte = (byte)(b1+b2);		
		byte resByte1 = 20+12;
		
		byte res7 = 126+1;
		byte res8 = (byte)(126+19);
		System.out.println(res8);
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
