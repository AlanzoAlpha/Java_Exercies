package scanner;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner cal = new Scanner(System.in);
		int num1;
		int num2;
		int Answer;

		System.out.println("Select the order of operation: ");
		char operator1 = cal.nextLine().charAt(0);
		System.out.println("Enter the first number: ");
		num1 = cal.nextInt();
		System.out.println("Enter the second number:");
		num2 = cal.nextInt();

		System.out.println("Select the order of operation: " + operator1);

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
