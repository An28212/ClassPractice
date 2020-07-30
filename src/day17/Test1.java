package day17;

public class Test1 {

	public static void main(String[] args) {
		parent obj = new parent();
		obj.sayHello();
		System.out.println(obj.name);
		child child = new child();
		child.sayHello();
		System.out.println(child.name);
	}

}
