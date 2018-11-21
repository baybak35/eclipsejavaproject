
public class Main {

	public static void main(String[] args) {
		
		//charAt(index) - returns char value for the particular index
		String str = "JavaScript";
		System.out.println(str.charAt(3));
		
		//length() - returns string length
		System.out.println(str.length());
		
		//substring(int beginIndex) - returns substring for given begin index
		System.out.println(str.substring(5));
		
		//substring(int beginIndex, int endIndex) - returns substrinf for given indexes
		System.out.println(str.subSequence(2, 6)); //end index isn't included
		
		//contains() - return true or false
		System.out.println(str.contains("va"));
		
		//equals(obj) - returns a boolean
		System.out.println(str.equals("JavaScript"));
		
		//isEmpty() - checks if it's empty
		System.out.println(str.isEmpty());
		
		//concat(String str)  concats the specified string
		System.out.println(str.concat(" Batch9"));

		//replace(char old,char new) - replaces all occurances of thecified char value
		System.out.println(str.replace("Script",""));
		
		//equalsIgnoreCase(string anouther) - comapres another string. I does not check case
		System.out.println(str.contains("javascript"));

		
		//split(string delimeter) - returns a split matching delimeter
		String str2 = "JavaScript is the best batch ever";
		String[] myArray = str2.split(" ");
		for(String word:myArray) {
			System.out.println(word);
		}
		
		//indexOf() - returns the specified char value index
		System.out.println(str.indexOf("v"));
		
		//indexOf(String substring, int fromIndex) - return the specified index
		System.out.println(str.indexOf('a',1));
		
		//toLOwerCase() - 
		System.out.println(str.toLowerCase());
		
		//toUpperCase()
		System.out.println(str.toUpperCase());
		
		//trim()
		System.out.println(str.trim());

		


		
		
		
		
		
		
		
		
		
		
		
		



		
	}

}
