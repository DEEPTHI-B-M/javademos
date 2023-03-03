package threadingdemo;

public class interruptdemo {
	public static void main(String[]args) {
		utils.printmessage("start");
		Thread t=new Thread(new Worker());
		t.start();
		try {
			Thread.sleep(3000);
			t.interrupt();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		utils.printmessage("end");
	}
}

class Worker implements Runnable{
	public void run() {
		utils.printmessage("start");
		for(int i=1;i<=10;i++) {
			utils.printmessage(""+i);
			try {
				Thread.sleep(5000);
			}catch(InterruptedException e) {
				utils.printmessage("thread interrupted");
			}
		}
		utils.printmessage("end");
	}
}
