
public class ThreadTester {
	public static void main(String args[]){
		Runnable threadJob = new MyRunnable();
		Thread myThread = new Thread(threadJob);
		Thread myThread2 = new Thread(threadJob);
		myThread.start();
		myThread2.start(); //Se for myThread.run() roda sequencialmente
		
	}
}
