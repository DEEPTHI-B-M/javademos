package javademoproject;

public class staticdemo {
	private staticdemo() {}
	
	static {
		System.out.println("from static block");
	}
	{
		System.out.println("from non static block 1");
	}
	public static void main(String[] args) {
		System.out.println("from main method");
		staticdemo jnsd1=new staticdemo();
		staticdemo jnsd2=new staticdemo();
		
		Car mycar=new Car();
		System.out.println(mycar.noofwheels);
		System.out.println(Car.manufacturer);
	}
	
}