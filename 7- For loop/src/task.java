
public class task {

	public static void main(String[] args) {
		name();
	}
	public static void name() {
		int sum15 = 0 ;
		int c=0;
		for(int i=1 ; i<1001 ; i++) {
			if(i%15==0) {
				sum15 = sum15 + i;
				System.out.println(sum15);
				c++;
			}
			if(c==5) {
				break;
			}
		}
		System.out.println(sum15);
	}

}
