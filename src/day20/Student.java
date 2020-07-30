package day20;

public class Student {
     private static Student student1;
	String name;
     public void assignInfo(String name) {
    	 this.name = name;
     }
     public static void main(String[]args) {
    	Student student = new Student(); 
    	
		student1.assignInfo("ram");
     }
}
