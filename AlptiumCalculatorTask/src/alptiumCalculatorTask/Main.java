package alptiumCalculatorTask;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
	
			
			// CALCULATOR  1.) USING CASE STATEMENTS, 2.) USING IF STATEMENTS, BOTH WORKING ON A WHILE LOOP.
   
	//CALCULATOR (1.) 		
			/*
	int num1 = 0; 
	int num2 = 0; 
	
	char operator; 
	
	int answer = 0; 
	int again = 0;
	System.out.println("Welcome to the Alptium Calculator program");
	

	do {
	System.out.println("Please enter your first number");
	num1 = sc.nextInt(); 
	
	System.out.println("Please select an operator");
	operator = sc.next().charAt(0);
	
	System.out.println("Please enter your second number");
	num2 = sc.nextInt(); 
	

	switch(operator) {
	case '+' : 
		answer = num1 + num2;
		break;
	case '-' : 
		answer = num1 - num2;
		break;
	case '*' : 
		answer = num1 * num2;
		break;
	case '/' : 
		answer = num1 / num2;
		break;
		default: 
		
	} System.out.println("Your result is: " + answer);
	
	System.out.println("Try again? Yes(1) No(2)");
	again = sc.nextInt(); 
	
	}while (again == 1);

			System.out.println("See you again soon!");
			
		*/		
			
			//CALCULATOR (2) 
			
			
			
			
			int num1 = 0; 
			int num2 = 0; 
			
			char operator; 
			
			int answer = 0; 
			int again = 0;
			System.out.println("Welcome to the Alptium Calculator program");
			

			do {
			System.out.println("Please enter your first number");
			num1 = sc.nextInt(); 
			
			System.out.println("Please select an operator");
			operator = sc.next().charAt(0);
			
			System.out.println("Please enter your second number");
			num2 = sc.nextInt(); 
			

			if ( operator == '+') {
			
				answer = num1 + num2;
			}else if ( operator =='-' ) {
				answer = num1 - num2;
			}else if (operator =='/') {
				answer = num1 / num2;
			}else if (operator == '*') {
				answer = num1 * num2; 
			} 
			
	     System.out.println("Your result is: " + answer);
	   
	     if (operator != '+' && operator !='-' && operator!='/' && operator !='*') {
				System.out.println("Please use the (/) (*) (+) or (-) operator");
			}
			
			System.out.println("Try again? Yes(1) No(2)");
			again = sc.nextInt(); 
			
			}while (again == 1);

					System.out.println("See you again soon!");
			
	}
	
}
	}


