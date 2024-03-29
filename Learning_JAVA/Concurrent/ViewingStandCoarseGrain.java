import java.util.concurrent.locks.*;

public class ViewingStandCoarseGrain {

	private int numSeats; //Total number of seats
	private int availableSeats; //Number of seats available
	public final Lock lock = new ReentrantLock();
	
	public ViewingStandCoarseGrain(int numSeats) {
        this.numSeats = numSeats;
        this.availableSeats = numSeats;
	}
	
	public boolean findSeat() {
		lock.lock();
		try {
			if (availableSeats > 0) {
				availableSeats--;
				return true;
			}
			else {
				return false;
			}
		}
		finally{
			lock.unlock();
		}
	}
	
	public boolean leaveSeat() {
        lock.lock();
        try {
            if (availableSeats < numSeats) {
                availableSeats++;
                return true;
            } else {
                return false;
            }
        } finally {
            lock.unlock();
        }
	}
	
	
	public static void main (String[] args) {
        ViewingStandCoarseGrain viewingStand = new ViewingStandCoarseGrain(10);
        
	}
}
