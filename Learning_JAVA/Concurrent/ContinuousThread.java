// Created a thread that continously prints a message every 1000 milliseconds.
// It can also be terminated by a control program.
// You may either end the program by clicking the red terminate button.
// Or you may type "quit" in the console to end the loop.

import java.util.Scanner;

public class ContinuousThread extends Thread {

	private volatile boolean runningStatus = true;
	
	public void run() {
		while(runningStatus) {
			System.out.println("This thread is running...");
			try {
				sleep(1000);
			} 
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	// Method to quit the exceution of thread
	public void quitThread() {
        runningStatus = false;
        //interrupt(); // Interrupt the sleeping thread
	}
	
	public static void main(String[] args) {
        System.out.println("Type 'quit' or 'q' to terminate the program.");
		ContinuousThread thread = new ContinuousThread();
		thread.start();
		
	    Scanner scanner = new Scanner(System.in);
        if (scanner.nextLine().equalsIgnoreCase("quit")) {
            thread.quitThread();
		}

	}

}
