
public class DeskPhone implements ITelephone{
	//first concrete class has to be overridden 
	
	private int myNumber;
	private boolean isRinging;
	
	
	

	public DeskPhone(int myNumber, boolean isRinging) {
		this.myNumber = myNumber;
		this.isRinging = isRinging;
	}

	public int getMyNumber() {
		return myNumber;
	}

	@Override
	public void powerOn() {
		System.out.println("No action taken, deskphone has no power button");
	}

	@Override
	public void dial(int phoneNumber) {
		System.out.println("Now ringing " + phoneNumber + " on deskphone");
	}

	@Override
	public void answer() {
		if(isRinging) {
			System.out.println("Answering the deskphone");
			isRinging = false;
		}
	}

	@Override
	public boolean callPhone(int phoneNumber) {
		if(phoneNumber==myNumber) {
			isRinging=true;
			System.out.println("Ring ring");
		}else {
			isRinging=false;
		}
		return false;
	}

	@Override
	public boolean isRinging() {
		return false;
	} 
	
	
	
	

}
