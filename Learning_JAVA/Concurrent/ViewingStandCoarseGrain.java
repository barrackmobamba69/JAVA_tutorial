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
		
	}
}
