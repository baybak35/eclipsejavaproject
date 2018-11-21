
public class Customer {
	
	private int acountNumber;
	private int balance;
	private String name;
	private String email;
	private int phoneNumber;
	
	public void deposit(int moneyAdd) {
		this.balance = this.balance + moneyAdd;
		System.out.println("Processed.Current balance is:"+this.balance);

	}
	
	public void withDraw(int moneyWithDrawn) {
		if(this.balance < moneyWithDrawn) {
			System.out.println("Insufficient fund");
			System.out.println("Current balance:"+this.balance);

		}else {
			this.balance = this.balance - moneyWithDrawn;
			System.out.println("Processed.Current balance is:"+this.balance);
		}
	}
	
	
	public int getAcountNumber() {
		return acountNumber;
	}
	public void setAcountNumber(int acountNumber) {
		this.acountNumber = acountNumber;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	
	
	
}
