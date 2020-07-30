package day9;

public class ElseIfDemo {

	public static void main(String[] args) {
		int marks = 45;
		if(marks<0||marks>=101) {
			System.out.println("invalid marks,");
			
		}else if (marks>=80 && marks <=100) {
			System.out.println("distinction");
		}else if (marks>=70 && marks <=79) {
			System.out.println("first");
		}else if (marks>=50 && marks <=69) {
			System.out.println("second");
		}else if (marks>=40 && marks <=49) {
			System.out.println("second");
		}else {
			System.out.println("fail");
		}

	}
		

}
