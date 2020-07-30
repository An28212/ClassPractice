package day2;

import javax.swing.JOptionPane;

public class Calculator3 {

	public static void main(String[] args) {
		int a = Integer.parseInt(JOptionPane.showInputDialog("Enter number1:"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Enter number2:"));
		
		int sum = a + b;
		int sub = a - b;
		int mul = a * b;
		int div = a / b;
		
		JOptionPane.showMessageDialog(null, "Addition of " + a + " and " + b + "is:" + sum);
		JOptionPane.showMessageDialog(null, "Subtraction of " + a + " and " + b + " is: " + sub);
		JOptionPane.showMessageDialog(null, "Multiplication of " + a + " and " + b + " is: " + mul);
		JOptionPane.showMessageDialog(null, "Division of  " + a + " and " + b + " is: " + div);
		
}

}
