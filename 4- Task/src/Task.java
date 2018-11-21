
public class Task {

	public static void main(String[] args) {
		
		byte mark = 60;
		
		if(mark > 90) {
			System.out.println("Passed with distinction");
		}else if(mark >=60 && mark<90) {
			System.out.println("Passed");
		}else {
			System.out.println("Fail");
		}

	}

}
