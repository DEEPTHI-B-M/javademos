package javademoproject;

public class datatypedemo {
	static int a;
	public static void main(String[]args) {
		a = (byte)150;
		System.out.println(a);
		short b=150;
		int c=1000;
		System.out.println(b);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		float f=1.23f;
		System.out.println(f);
		
		double g=12345.6789;
		System.out.println(g);
	}
}
