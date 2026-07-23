package multithreading;

class Myrunnable implements Runnable{
	public void run(){
		System.out.println("Thread is running......");
	}
}


public class runnable {

	public runnable() {
	}

	public static void main(String[] args) {
		Thread t1 = new Thread(new Myrunnable());
		t1.start();

	}

}
	