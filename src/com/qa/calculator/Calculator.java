package com.qa.calculator;
import java.util.*;

public class Calculator {
	
	public static void main(String[] args) {
	
	int firstnumber;
	int secondnumber;
	String operator;
	

	
	System.out.println("Enter your first number: ");
	firstnumber = myCalc.nextInt();
	
	System.out.println("Choose Arithmetic Operator from '+ - * /': ");
	operator = myCalc.next();
	
	System.out.println("Enter your second number: ");
	secondnumber = myCalc.nextInt();
	
	
	switch (operator) {
	case "+" :
		System.out.println("Adding the two operands equal to " + (firstnumber + secondnumber));
		break;	
	case "-" :
		System.out.println("Subtracting the two operands equal to " + (firstnumber - secondnumber));
		break;
	case "*" :
		System.out.println("Multiplying both operands equal to " + (firstnumber * secondnumber));
		break;
	case "/" :
		System.out.println("Divinding both operands equal to " + (firstnumber / secondnumber));
		break;
	default:
		System.out.println("Please use a valid operator. ");
		break;
		
	switch(operator)
		{
		case "+" :
			System.out.println("Adding the two operands equal to " + (firstnumber + secondnumber));
			break;	
		case "-" :
			System.out.println("Subtracting the two operands equal to " + (firstnumber - secondnumber));
			break;
		case "*" :
			System.out.println("Multiplying both operands equal to " + (firstnumber * secondnumber));
			break;
		case "/" :
			System.out.println("Divinding both operands equal to " + (firstnumber / secondnumber));
			break;
	}
	}
	

}
