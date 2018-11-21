
public class A5 {

	public static void main(String[] args) {
		System.out.println(isLeapYear(-1600));	//= > false
		System.out.println(isLeapYear(1600));	//= > true
		System.out.println(isLeapYear(2017));	//= > false
		System.out.println(isLeapYear(2000));	//= > true

	}
	
	public static boolean isLeapYear(int year) {
		if( year%4==0 || year%400==0 ) {
			if(year%100!=0) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
}
