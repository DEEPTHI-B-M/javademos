package threadingdemo;

public class utils {
	public static void printmessage(String message) {
		System.out.println(Thread.currentThread().getName()+"-"+message);
	}
}
