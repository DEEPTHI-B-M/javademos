package exceptiondemo;
import java.util.Scanner;
public class Exceptiondemo {
	public static void main(String[]args) {
		int a,b;
		float c,d;
		System.out.println("enter two nos..");
		Scanner scanner=new Scanner(System.in);
		a=scanner.nextInt();
		b=scanner.nextInt();
		try {
			c=a/b;
			d=a%b;
			System.out.println(a+"/"+b+"="+c);
			System.out.println("remainder:"+d);
		}catch(Exception e) {
			System.out.println("exception occured"+ e.getMessage());
		}
			
		}
		private static void string() {
			String s="hello";
			try {
			int i=Integer.parseInt(s);
			System.out.println(+i);
			}catch(Exception e) {
				System.out.println("exception occured"+e.getMessage());
			}
			}
		
	}

