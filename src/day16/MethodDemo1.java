package day16;

public class MethodDemo1 {

	public  void sayHello() {
		System.out.println("hello");

	}
   public void greet (String name) {
	System.out.println("Hello, " + name +", Good Morning.");
}
    public String returnInfo() {
    	String name = "Krishna Thapa";
    	String adress = "Kathmandu, Nepal";
    	return name + " " + adress;
    }
    public void findMax(int a, int b) {
    	int max = 0;
    	if(a>b) {
    		max = a;
    	}else {
    		max = b;
    	
    	
    }
    }
}
