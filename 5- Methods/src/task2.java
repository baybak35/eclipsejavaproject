
public class task2 {

	public static void main(String[] args) {

		System.out.println(calcFeetAndInchesToCentimeters(6,0));
		System.out.println(calcFeetAndInchesToCentimeters(-10,0));
		System.out.println(calcFeetAndInchesToCentimeters(0,1));
		System.out.println(calcFeetAndInchesToCentimeters(100));
		System.out.println(calcFeetAndInchesToCentimeters(156));
	
	}
	
	public static double calcFeetAndInchesToCentimeters(double f, double i) {
		
		if( f<0 || (i<0 || i>=12) ) {
			System.out.println("Invalid feet or inches");
			return -1;
			
		}else{
		double cm = (f*12*2.54) + (2.54*i) ;
		return cm ;
		}
	}
	
	public static double calcFeetAndInchesToCentimeters(double i) {
		
		if( i<0 ) {
			System.out.println("Invalid feet or inches");
			return -1;
		}else{
			
		double cm = 2.54*i;
		return cm;
		
		}
		
	}

}
