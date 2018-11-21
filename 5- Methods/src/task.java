
public class task {

	public static void main(String[] args) {
		
		displayHighScorePosition("Batu", calculateHighScorePosition(1500));
		displayHighScorePosition("Batu", calculateHighScorePosition(900));
		displayHighScorePosition("Batu", calculateHighScorePosition(400));
		displayHighScorePosition("Batu", calculateHighScorePosition(50));

		
	}
	
	public static void displayHighScorePosition(String n1, int highScorePosition ) {
		System.out.println(n1 +" managed to get into position " + highScorePosition + " on the high score table ");
				
	}
	
	public static int calculateHighScorePosition(int score) {
		if(score>=1000) {
			return 1;
		}else if(score>=500 && score<1000) {
			return 2;
		}else if(score>=100 && score<500) {
			return 3;
		}else {
			return 4;
		}
	}
	
	
	

}
