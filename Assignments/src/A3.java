
public class A3 {

	public static void main(String[] args) {
		printMegaBytesAndKiloBytes(2050);
	}
	public static void printMegaBytesAndKiloBytes(int kiloBytes) {
		if(kiloBytes<0) {
			System.out.println("Invalid value");
		}else {
			int mb = kiloBytes/1024;
			int kb = kiloBytes - (mb*1024);
			
			System.out.println(mb + " MBs and " + kb + " KBs" );
		}
	}
}
