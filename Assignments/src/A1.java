
public class A1 {

	public static void main(String[] args) {
		tax(1300000000);
	}
	

	public static void tax(int income){
		int tx = 0;
		
		if(income<=150_000_000) {
			tx = tx + income*25/100;
		}else if(income<=300_000_000) {
			tx = income*30/100;
		}else if(income<=600_000_000) {
			tx = income*35/100;
		}else if(income<=1_200_000_000) {
			tx = income*40/100;
		}else if(income>1_200_000_000) {
			tx = income*50/100;
		}
		System.out.println(tx);
		
		
	}

}
