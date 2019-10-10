package in.easyapp.licence4j.easyapplicence4j;

public class ThreadExample extends Thread{
	private String t;
	
	public ThreadExample(String t) {
		this.t = t;
	}
	
	@Override
	public void run() {
		System.out.println(t+" Print");
	}
	
	public static void main(String[] args) throws InterruptedException {
		ThreadExample t1 = new ThreadExample("t1");
		ThreadExample t2 = new ThreadExample("t2");
		ThreadExample t3 = new ThreadExample("t3");
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		
	}

}
