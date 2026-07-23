package multithreading;

class ThreadPriorityExample extends Thread{
	public void run() {
		System.out.println("Inside the run() example");
	}
}


public class thread_priority {

	public thread_priority() {
		
	}

	public static void main(String[] args) {
		ThreadPriorityExample t1 = new ThreadPriorityExample();
		ThreadPriorityExample t2 = new ThreadPriorityExample();
		
		System.out.println("Priority of the thread t1 : " + t1.getPriority());
		System.out.println("Priority of the thread t2 : " + t2.getPriority());
		
		t1.setPriority(6);
		t2.setPriority(3);
		
		System.out.println("Priority of the thread t1 : " + t1.getPriority());
		System.out.println("Priority of the thread t2 : " + t2.getPriority());
	}

}
