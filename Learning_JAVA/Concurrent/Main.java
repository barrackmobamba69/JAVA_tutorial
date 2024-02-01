import java.util.concurrent.TimeUnit;

class PrintThread extends Thread {
  private volatile boolean running = true;
  
  public void run() {
    while(running) {
      System.out.println("I'm alive!");
      
      try {
        TimeUnit.MILLISECONDS.sleep(100);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
  
  public void stopThread() {
    running = false;
  }
}

public class Main {

  public static void main(String[] args) {
    PrintThread thread = new PrintThread();
    thread.start();
    
    // Let thread run for some time
    try {
      TimeUnit.SECONDS.sleep(5);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    
    // Stop thread
    thread.stopThread();
  }

}
