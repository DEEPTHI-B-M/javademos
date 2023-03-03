package joindemo;

import java.util.Scanner;

public class joindemo {
	public static void main(String[]args) {
		printmessage("sum of n numbers");
		printmessage("enter a value");
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		
		Calculator calc=new Calculator(n);
		calc.start();
		
		try {
			calc.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		printmessage("sum of first "+n+"numbers="+calc.getSum());
	}
	private static void printmessage(String message) {
		System.out.println(Thread.currentThread().getName()+"-"+message);
	}
}

class Calculator extends Thread{
	int n;
	int sum;
	
	Calculator(int n){
		this.n=n;
	}
	public void run() {
		for (int i=1;i<=n;i++) {
			this.sum+=i;
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public int getSum() {
		return sum;
	}
}