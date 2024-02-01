//// Created thread that shows the implementation of tossing coin, inputting in either heads or tails
//
//public class Lab1 extends Thread {
//	
//	private static final double THRESHOLD_VALUE = 0.5;
//	
//	public Lab1() {
//	}
//	
//	@Override
//	public void run() {
//		if (Math.random() > THRESHOLD_VALUE) {
//			System.out.println("The outcome is Heads");
//		}
//		else {
//			System.out.println("The outcome is Tails");
//		}
//	}
//	
//	public static void main (String args[]) {
//		Lab1 thread = new Lab1();
//		thread.start();
//	}
//	
//}


//*****************************************************************************************


//Created thread that tosses a coin 1000 times and computes the frequency of heads and tails

public class Lab1 extends Thread {
	
	private static final double THRESHOLD_VALUE = 0.5;
	private int counter1;
	private int counter2;
	
	public void run() {
		for (int i = 0; i < 1000; i++) {
			if (Math.random() > THRESHOLD_VALUE) {
				counter1++;
			}
			else {
				counter2++;
			}
		}
	}
	
	public static void main (String args[]) {
		Lab1 thread = new Lab1();
		thread.start();

      try {
          // Wait for the Lab1 thread to complete
          thread.join();
      } catch (InterruptedException e) {
          e.printStackTrace();
      }

      System.out.println("Heads: " + thread.counter1);
      System.out.println("Tails: " + thread.counter2);
	}
	
}


