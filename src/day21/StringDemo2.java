package day21;

public class StringDemo2 {

	public static void main(String[] args) {
		String s1 = "Nepal";
		String s2 = "Nepal";
		
		String s3 = new String("Nepal");
		String s4 = new String("Nepal");
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s3 == s4);

		
		System.out.println(s1.contentEquals(s2));
		System.out.println(s1.contentEquals(s3));
		System.out.println(s3.contentEquals(s4));
	}

}
