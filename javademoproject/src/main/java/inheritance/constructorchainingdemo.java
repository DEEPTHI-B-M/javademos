package inheritance;

public class constructorchainingdemo {
	public static void main(String[]args) {
		//ChildClass cc=new ChildClass(10);
		ChildClass cc=new ChildClass();
	}
}
class SuperClass{
	int x;
	SuperClass(){
		System.out.println("no args super class constructor");
	}
	SuperClass(int x){
		this.x=x;
		System.out.println("one arg super class constructer");
	}
}
class ChildClass extends SuperClass{
	ChildClass(){
		this(10);
		System.out.println("no args child class constructor");
	}
	ChildClass(int y){
		super(y);
		System.out.println("one args child class constructor");
	}
}
