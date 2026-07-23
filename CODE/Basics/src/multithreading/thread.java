package multithreading;

class Multi extends Thread{
	@Override
	public void run() {
		System.out.println("Thread is running....");
	}
	
	
}

public class thread {

	public thread() {
		
	}

	public static void main(String[] args) {
		Multi m1 = new Multi();
		m1.start();

	}

}
