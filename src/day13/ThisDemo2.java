package day13;

public class ThisDemo2 {
  String name;
  int age;
  public ThisDemo2(String n, int a) {
	  name = n;
	  age = a;
  }

public void printinfo() {
	System.out.println(" Name is:" + name);
	System.out.println("Age is :" + age);
}
	public static void main(String[] args) {
		ThisDemo2 ob = new ThisDemo2("ram", 22); 
		ob.printinfo();
	}

}
