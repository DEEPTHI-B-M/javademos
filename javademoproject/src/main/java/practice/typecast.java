package practice;

import java.util.Scanner;

public class typecast {
	public static void main(String[]args) {
		System.out.println("enter string");
		Scanner scanner=new Scanner(System.in);
		String str=scanner.next();
		try {
			int i=Integer.parseInt(str);
			float f=Float.parseFloat(str);
			double d=Double.parseDouble(str);
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}
		
	}
}
