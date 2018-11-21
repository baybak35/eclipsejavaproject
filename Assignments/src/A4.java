
public class A4 {
	public static void main(String[] args) {
		bark(true,1);// = > true
		bark(false,2);// = > false
		bark(true,8);// = > false
		bark(true,-1);// = > false
	}
	public static void bark(boolean barking, int hourOfDay) {
		if(barking==true) {
			if(hourOfDay<0 || hourOfDay>23) {
				System.out.println(false);
			}else if(hourOfDay<8 || hourOfDay>22) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
		}else {
			System.out.println(false);
		}
	}

}
