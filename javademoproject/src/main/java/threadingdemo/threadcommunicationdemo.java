package threadingdemo;

public class threadcommunicationdemo {
	public static void main(String[]args)throws InterruptedException{
		MyThread mythread=new MyThread();
		Thread t=new Thread(mythread);
		t.setName("T1");
		t.start();
		synchronized(t) {
			utils.printmessage("going to wait");
			t.wait();
			utils.printmessage("notified");
			utils.printmessage("total="+mythread.total);
		}
	}
}
class MyThread implements Runnable{
	int total;
	public void run() {
		utils.printmessage("calculating sum");
		synchronized(this) {
			for(int i=0;i<=100;i++) {
				total+=i;
			}
			utils.printmessage("calculation completed..notifying");
			this.notify();
		}
	}
	public int getTotal() {
		return total;
	}
}
