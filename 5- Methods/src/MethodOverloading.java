
public class MethodOverloading {

	public static void main(String[] args) {
		
		

	}
	
	public static int calculateScore(String playerName, int score) {
		System.out.println("Player named " + playerName + " scored " + " points" );
		return score*100;
	}
	
	public static int calculateScore(int score) {
		System.out.println("Unnamed player scored " + score + " points");
		return score*100;
		
	}
	
	public static void calculateScore() {
		System.out.println("No player name, no player score");
	}
	
	
}
