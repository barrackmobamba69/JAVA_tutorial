//This is a laptop class
//Learning OOP concepts
	
public class Day1 {
	
	// Laptop attributes
	String laptopMake;
	String processortype;
	int ram;
	int harddrive;
	int price;
	
	// Laptop constructor
	public Day1(String laptopMake, String processortype, int ram, int harddrive, int price) {
		this.laptopMake = laptopMake;
		this.processortype = processortype;
		this.ram = ram;
		this.harddrive = harddrive;
		this.price = price;
	}
	
	// A method called info() that displays all info on the Laptop
	public String info() {
		return "The laptop brand is" + laptopMake + " and the processor type is " + processortype + ". Furthermore, the ram and hard drive is " + ram + ", and " + harddrive + " respectively. Finally, the price of the laptop is " + price + ".";
	}

	// Method getRam() that returns the amount of RAM
	public int getRam() {
		return ram;
	}
	
	// Method adjustPrice() that increases or decreases the price
	public int adjustPrice() {
		return ram;
	}

}

