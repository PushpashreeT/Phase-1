package com.assistedproject;
import java.util.Scanner;

	

	public class Calculator {
	  public static void main(String[] args) {

	    char operator;
	    float number1, number2, result;

	    
	    Scanner input = new Scanner(System.in);

	    while(true) {
	    System.out.println("Choose an operator: +, -, *, or /");
	    operator = input.next().charAt(0);

	    
	    System.out.println("Enter first number");
	    number1 = input.nextFloat();

	    System.out.println("Enter second number");
	    number2 = input.nextFloat();

	    switch (operator) {

	     
	      case '+':
	        result = number1 + number2;
	        System.out.println(number1 + " + " + number2 + " = " + result);
	        break;

	      
	      case '-':
	        result = number1 - number2;
	        System.out.println(number1 + " - " + number2 + " = " + result);
	        break;

	   
	      case '*':
	        result = number1 * number2;
	        System.out.println(number1 + " * " + number2 + " = " + result);
	        break;
	      
	      case '/':
	        result = number1 / number2;
	        System.out.println(number1 + " / " + number2 + " = " + result);
	        break;

	      default:
	        System.out.println("Invalid operator!");
	        break;
	    }
	    }
	  
	  }
	}



