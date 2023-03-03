package polymorphismdemo;

public class runtimepolymorhism {
	public static void main(String[]args) {
		macbook mac=new macbookair();
		mac.start();
		mac.shutdown();
	}
	
}
class macbook{
	void start() {
		System.out.println("macbook started...");
	}
	void shutdown() {
		System.out.println("macbook shutdown...");
	}
}

class macbookair extends macbook{
	void start() {
		System.out.println("macbookair started...");
	}
	void shutdown() {
		System.out.println("macbookair shutdown...");
	}
}