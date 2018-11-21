
public class BankAccount {

	public static void main(String[] args) {
		
		Customer Batu = new Customer();
		Batu.setBalance(5000);
		System.out.println(Batu.getBalance());
		
		Batu.withDraw(3000);
		System.out.println(Batu.getBalance());

		
	}

}
