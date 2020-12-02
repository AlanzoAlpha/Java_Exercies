package Trycatch1;

import java.util.InputMismatchException;
import java.util.Scanner;

///import java.util.
public class Trycatch {
	public static void main(String[] args) {
//First try block
		try {
			int[] myNumbers = { 1, 2, 3 };
			System.out.println(myNumbers[10]);
		} catch (Exception e) {
			System.out.println("Worng input");
		} finally {
			System.out.println("What did you catch?");
		}

//Second try block

		Scanner cal = new Scanner(System.in);
		int num1;
		int num2;
		int Answer;

		System.out.println("Select the order of operation(+, -, *, / ):");
		char operator1 = cal.nextLine().charAt(0);
		System.out.println("Enter the first number: ");
		num1 = cal.nextInt();
		System.out.println("Enter the second number:");
		num2 = cal.nextInt();

		System.out.println("The select the order of operation is: " + operator1);

		try {
			cal1(num1, num2, operator1);

		} catch (ArithmeticException e) {
			System.out.println("Division by zero exception");

		} catch (InputMismatchException e) {
			System.out.println("Input miss match exception");

		} finally {
			System.out.println("Did you get an exception?");
		}
	}

	public static void cal1(int num1, int num2, char operator1) {
		int Answer;

		if (operator1 == '+') {
			Answer = (num1 + num2);
			System.out.println("Answer:" + Answer);
		} else if (operator1 == '-') {
			Answer = (num1 - num2);
			System.out.println("Answer:" + Answer);
		} else if (operator1 == '*') {
			Answer = (num1 * num2);
			System.out.println("Answer:" + Answer);
		} else if (operator1 == '/') {
			Answer = (num1 / num2);
			System.out.println("Answer:" + Answer);
		} else {
			System.out.println("Not a valid input");
		}

	}
}
