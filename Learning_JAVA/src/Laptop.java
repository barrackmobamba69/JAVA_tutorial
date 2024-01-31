// Day 1 - Learning OOP concepts

public class Laptop {
	
	// Laptop attributes
	String make;
	String processorType;
	int ram;
	int harddrive;
	int price;
	
	// Laptop constructor
	public Laptop(String make, String processorType, int ram, int harddrive, int price) {
		this.make = make;
		this.processorType = processorType;
		this.ram = ram;
		this.harddrive = harddrive;
		this.price = price;
	}
	
	// A method called info() that displays all info on the Laptop
	public String info() {
		return "The laptop brand is " + make + " and the processor type is " + processorType + ". \nFurthermore, the ram and hard drive is " + ram + ", and " + harddrive + " respectively. Finally, the price is " + price + ".";
	}

	// Method getRam() that returns the amount of RAM
	public int getRam() {
		return ram;
	}
	
	// Method adjustPrice() that increases or decreases the price
	public void adjustPrice(int adjustment) {
		price = price + adjustment;
	}
	
	public void deductPrice() {
		price = price - 100;
	}
}