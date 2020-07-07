package com.qa.Exceptions;

public class Runner {

	public static void main(String[] args) {
		int num1, num2;

		// try catch block

		try {
			num1 = 0;
			num2 = 69 / num1;
			System.out.println(num2);
			System.out.println("End of try block");
		} // insert "Finally" to complete TryStatement

		catch (ArithmeticException e) {
			// will only execute if any Arithmetic exception occurs in the try block
			System.out.println("You cannot divide a number by zero");
		}

		catch (Exception e) {
			// this is a generic exception handler which means it can handle all the
			// exceptions. This will execute if the exception is not handled by previous
			// catch blocks

			System.out.println("Error occured");

		}
		System.out.println("End of the try-catch block");
	}

}
