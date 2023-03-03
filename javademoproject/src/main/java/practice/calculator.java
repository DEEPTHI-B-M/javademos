package practice;

import java.util.Scanner;

public class calculator {
	 public static void main(String[]args) {
		 int n1;
		 int n2;
		 System.out.println("enter n1 and n2");
		 Scanner scanner=new Scanner(System.in);
		 n1=scanner.nextInt();
		 n2=scanner.nextInt();
		 int sum=n1+n2;
		 int difference=n1-n2;
		 int product=n1*n2;
		 int quotient=n1/n2;
		 System.out.println(sum);
		 System.out.println(difference);
		 System.out.println(product);
		 System.out.println(quotient);
		 }
}
