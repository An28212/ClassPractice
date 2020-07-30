package day11;

public class MethodDemo1 {

	public  void sayHello() {
		System.out.println("Hello From Nepal");

	}
public static void main(String[]args) {
	System.out.println("main start");
	MethodDemo1 ob = new MethodDemo1();
	ob.sayHello();
	System.out.println("main end");
}
}
