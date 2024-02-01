// Day 1 - Learning OOP concepts
// This class tests the Day1 class

public class Test {

	public static void main (String args[]) {
		
		// Created two instances of class Day1
		Laptop firstLaptopInstance = new Laptop("Asus", "Ryzen", 8, 64, 25000);
		Laptop secondLaptopInstance = new Laptop("HP", "Intel", 16, 64, 30000);
		
		// Printing the info for both Laptops
		System.out.println("First laptop's information: ");
		System.out.println(firstLaptopInstance.info());
		System.out.println("\nSecond laptop's information: ");
		System.out.println(secondLaptopInstance.info());
		
		// Task2: Print out which laptop has more RAM
		if (firstLaptopInstance.getRam() > secondLaptopInstance.getRam()) {
			System.out.println("First laptop has more RAM");
		}
		else if (secondLaptopInstance.getRam() < firstLaptopInstance.getRam()) {
			System.out.println("Second laptop has more RAM");
		}
		else {
			System.out.println("Both laptops have equal amount of RAM");
		}
		
		// Task3: Lower the price of the Laptop with less Ram by 100
		if (firstLaptopInstance.getRam() < secondLaptopInstance.getRam()) {
			firstLaptopInstance.deductPrice();
		}
		System.out.println("\nThe updated price is " + firstLaptopInstance.price);

		System.out.println("\n*******************************");
		
//***********************************************************************************
//***********************************************************************************

		LogicGate logic = new LogicGate(false);

		if ((logic.state) = false) {
			System.out.println("The logic gate is off, i.e., " + logic.state);
		}
		else if ((logic.state) = true) {
			System.out.println("The logic gate is on, i.e., " + logic.state);
		}
		
		System.out.println("\nThe current state is " + logic.getState());
		logic.not();
		logic.set();
		logic.negate();
	}
}
