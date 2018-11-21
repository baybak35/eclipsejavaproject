
public class Task {

	public static void main(String[] args) {

		char ch = 'C';
		
		switch (ch) {
		case 'A': case 'B': case 'C': case 'D': case 'E':
			System.out.println(ch + " was found");
			break;
		default:
			System.out.println("It was not found");
			break;
		
		}
	}

}
