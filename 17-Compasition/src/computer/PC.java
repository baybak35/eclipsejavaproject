package computer;

public class PC {
	//now everything gathers
	//1st write properties, 2nd create constructor, 3rd create getters(maybe setters)

	private Case theCase;
	private Monitor theMonitor;
	private Motherboard theMotherBoard;
	
	public PC(Case theCase, Monitor theMonitor, Motherboard theMotherBoard) {
		super();
		this.theCase = theCase;
		this.theMonitor = theMonitor;
		this.theMotherBoard = theMotherBoard;
	}
	public Case getTheCase() {
		return theCase;
	}
	public Monitor getTheMonitor() {
		return theMonitor;
	}
	public Motherboard getTheMotherBoard() {
		return theMotherBoard;
	}
	
	
	
}
