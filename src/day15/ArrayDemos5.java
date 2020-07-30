package day15;

import java.util.Scanner;

public class ArrayDemos5 {

	public static void main(String[] args) {
		final int ROW = 3;
		final int COLUMN = 3;
		int[] [ ]arr = new int[ROW][COLUMN];
		Scanner input = new Scanner(System.in); 
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				System.out.println("Enter:");
				arr[i][j] = input.nextInt();
			}
		}
		 
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[0][2]);
		
		System.out.println(arr[1][0]);
		System.out.println(arr[1][1]);
		System.out.println(arr[1][2]);
		
		System.out.println(arr[2][0]);
		System.out.println(arr[2][1]);
		System.out.println(arr[2][2]);
		
		
	}

}
