
public class A2 {

	public static void main(String[] args) {
		isCatPlaying(10,true);  //= > false
		isCatPlaying(36,false); //= > false
		isCatPlaying(35,false); //= > true
	}
	
	public static void isCatPlaying(int temp, boolean bool ) {
		
		if( ( (temp>25 && temp<=35) && (bool==false) ) || ( (temp>25 && temp<45) && (bool==true) ) ) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}
}
