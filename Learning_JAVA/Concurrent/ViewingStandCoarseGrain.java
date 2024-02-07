import java.util.concurrent.locks.*;

public class ViewingStandCoarseGrain {

	private int numSeats;
	private int availableSeats;
	public final Lock lock;
	
	public ViewingStandCoarseGrain(int numSeats) {
        this.numSeats = numSeats;
        this.availableSeats = numSeats;
        this.lock = new ReentrantLock();

	}
	
	public void run() {
		
	}
	
	public void findSeat() {
		numSeats++;
	}
	
	public void leaveSeat() {
		numSeats--;
	}
	
	
	public static void main (String[] args) {
		
	}
}
