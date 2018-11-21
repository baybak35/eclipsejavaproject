import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		//simpleDate format is a concrete for formating and passing date which inherits
		//java.text.Dateformat class
		//formating means converting date to string , and pasrsoin means converting string into date
		
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); //M-month, m-minute
		String strDate = formatter.format(date);
		System.out.println(strDate);
		
		formatter = new SimpleDateFormat("MM/dd/yyyy");
		strDate = formatter.format(date);
		System.out.println(strDate);
		
		formatter = new SimpleDateFormat("dd MMMM yyyy");
		strDate = formatter.format(date);
		System.out.println(strDate);
		
		formatter = new SimpleDateFormat("MMMM dd, yyyy");
		strDate = formatter.format(date);
		System.out.println(strDate);
	
		formatter = new SimpleDateFormat("MMMM dd, yyyy");
		strDate = formatter.format(date);
		System.out.println(strDate);
		
		formatter = new SimpleDateFormat("dd MMMM yyyy hh:mm:ss z"); 
		strDate = formatter.format(date);
		System.out.println(strDate);
		
		formatter = new SimpleDateFormat("dd MMMM yyyy hh:mm:ss zzzz");
		strDate = formatter.format(date);
		System.out.println(strDate);
		
		//Conver String into date
		formatter = new SimpleDateFormat("dd/MM/yyyy");
		try {
			date = formatter.parse("31/03/2015");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		
		
		
	
	}
	

}













