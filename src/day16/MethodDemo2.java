package day16;
import java.util.Scanner;
public class MethodDemo2 {

	public static void printArrayElement(int[] arr) {
		for (int a : arr) {
System.out.println(a);
	}
	}
	public static int[] returnArray(Scanner input) {
		System.out.println("Enter size of an array:");
		int size = input.nextInt();
		int[]arr = new int[size];
		for(int i = 0; i < arr.length; i++) {
	System.out.println("Enter element:");
	arr[i] = input.nextInt();
		}
		return arr;
	}
}
