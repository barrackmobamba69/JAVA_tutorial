public class ParallelFrequency {
	
	public void run() {
		System.out.println();
	}
	
	public static void main(String[] args) {
		// This code is a sequential program that calculates the frequency of even values 
		int f[] = new int[1000000];
		for (int j = 0; j < f.length;j++) 
			f[j] = (int)(Math.random()*100000);
		int freq = 0;
		for (int j = 0; j < f.length; j++)
			if (f[j] % 2 == 0) freq++;
		System.out.println(freq);
    }
}
