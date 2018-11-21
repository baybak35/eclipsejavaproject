package computer;

public class Main {

	public static void main(String[] args) {
		
		Dimensions theDimensions = new Dimensions(20,40,0);
		Case theCase = new Case("2200","Dell","240", theDimensions);
		
		Motherboard theMotherBoard = new Motherboard("BJ-200","Asus",4,6,"v2.44");
		Monitor theMonitor = new Monitor("27inc beast","Acer",27, new Resolution(2540,1440));
		
		PC thePC = new PC(theCase,theMonitor,theMotherBoard);
		
		thePC.getTheMotherBoard().loadProgram("Windows 1.0");
		thePC.getTheCase().pressPowerButton();		
	}

}

//PC has Case, Monitor, Motherboard
//but also	Case has  model,  manufacturer, powerSupply, dimensions
//but also	Monitor has  model,  manufacturer,  size,  resolution1
//but also	Motherboard has  model, manufacturer, ramSlots, cardSlots, bios

//The only thing we can call from thePC is , methods in thePC
