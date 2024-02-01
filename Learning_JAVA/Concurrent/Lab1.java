// Created thread that shows the implementation of tossing coin, inputting in either heads or tails

public class Lab1 extends Thread {
	
	private static final double THRESHOLD_VALUE = 0.5;
	
	public Lab1() {
	}
	
	@Override
	public void run() {
		if (Math.random() > THRESHOLD_VALUE) {
			System.out.println("The outcome is Heads");
		}
		else {
			System.out.println("The outcome is Tails");
		}
	}
	
	public static void main (String args[]) {
		Lab1 thread = new Lab1();
		thread.start();
	}
	
}
