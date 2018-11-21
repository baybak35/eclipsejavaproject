
public class A8 {

	public static void main(String[] args) {
		//getDurationString(3600);
		getDurationString(61, 3600);
	}
	
	public static void getDurationString(int min, int sec) {
		if( (min<0) || (sec<0 && sec>59) ) {
			System.out.println("Invalid Value");
		}else {
			int h = min/60;
			int m = h*60-min;
			int s = h*60*60-sec;
			System.out.println(h+" hours " + m + " minutes " + s + " seconds.");
		}
	}
	
	public static void getDurationString(int sec) {
		if(sec<=0) {
			System.out.println("Invalid Value");
		}else {
			int h = sec/3600;
			int m = (h*60)-(sec/60);
			int s = (h*3600)-sec;
			System.out.println(h+" hours " + m + " minutes " + s + " seconds.");
		}
	}

}
