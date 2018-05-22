package exercises;

import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(Scanner sc = new Scanner(System.in)) {
		
		
		/*EXERCISE JAVA CODE: ERASE THE COMMENTS 
	//1.) Write a Java program to print the sum of two numbers. 
		
		try(Scanner sc = new Scanner(System.in)) {
		
	/*System.out.println("Welcome to the sum calculator");		
	System.out.println("Enter first number.");
	int number1 = sc.nextInt(); 
	
	System.out.println("Enter your second number");
	int number2 = sc.nextInt(); 
	
	int sum = number1 + number2; 
	System.out.print("Sum: " + sum); //correct! 
	
	*/// Exercise solved^_^
		
		
	
	
			
			//2.) Write a program to devide two numbers and print on the screen	
			
	/*System.out.println("Welcome to the division calculator");
	
	System.out.println("Please enter your first number");
	int num1= sc.nextInt(); 
	
	System.out.println("Please enter your second number");
	int num2 = sc.nextInt(); 
	
	int result = num1 / num2; 
	
	System.out.println("The division result is: " + result);
	
	*/ // Exercise solved ^_^
			
		
			
			
			
			//3.) Write a program that takes two numbers as input and
			//Displays the product of those numbers
			
	  /*System.out.println("Number's product calculator ");
			
			System.out.println("Enter first number");
		int num1 = sc.nextInt(); 
		
		System.out.println("Enter your secomnd number");
		int num2 = sc.nextInt(); 
		
		int product = num1 * num2;
		System.out.println("The product is: " + product);
		*/ 
			//Exercise complete ^_^
		
		
		
			
// 4.) The program should print the sum, multyply, subtract, divide and remainder 
			//of the follwing numbers: 125+24; 124-24; 125x24, 125/24

			/*
System.out.println("Welcome to the, sum, division, subtraction, product and moduo calculator");

System.out.println("Please enter your first number:");
int num1 = sc.nextInt(); 

System.out.println("Please enter your second number");
int num2 = sc.nextInt(); 

int sum = num1 + num2; 
int subtraction = num1 - num2; 
int product = num1 * num2; 
int division = num1 / num2; 
int moduo = num1 % num2; 


System.out.println(num1+" + "+ num2+" = "+ sum);
System.out.println(num1+ " - "+ num2+" = " + subtraction);
System.out.println(num1+" * "+num2+" = "+product);
System.out.println(num1+" / "+num2+" = "+division);
System.out.println(num1+" % "+num2+" = "+moduo);
		
	*/	//Exercise completed ^_^ 
			
			
		
		
//5.)  Write a Java program that takes a number as input and prints
// it's multiplication table up to 10.
/*		
System.out.println("Welcome to the multiplications table calculator");
	
System.out.println("Please enter your number");

int number = sc.nextInt(); 
int  x = 1;
for ( x = 1; x <= 10; x++) {
	System.out.println(number+ " x "+x+" = " +x * number );
}

*///exercise completed. ^_____^


			
			
//6.) Write a Java program that takes a number "user input1" and prints 
// its multiplication table from "user input2"number to the "user input3" number. example: number 10, table product from 1 to 10.

			
			/*
System.out.println("Welcome to the multiplications table calculator");		
		
System.out.println("Enter number");	

int x = 1;
int number = sc.nextInt(); 

System.out.println("Enter the number you would like to start the table from");

int start = sc.nextInt();

System.out.println("Enter the number the table should end with");
 
int end = sc.nextInt(); 


for (x = 1 * start; x <= end; x++ ) {
	System.out.println(number+" x "+x+" = "+ number*x);
}

*/// Exercise solved ^_____^
			
			
//7) write a java program that takes three numbers as input 
// to calculate and print the average of the numbers. 
			
		/*	System.out.println("Calculator of the values average:");
			
			System.out.println("Enter first number ");
			int num1 = sc.nextInt(); 
			
			System.out.println("Enter second number");
			int num2 = sc.nextInt(); 
			
			System.out.println("Enter third number");
			int num3 = sc.nextInt(); 
			
			int sum = num1 + num2 + num3; 
			int average = sum / 3;
			System.out.println("The average value is: "+average);
		
	*/// The task is complete ^_^ and it works. 
			

			
			
// 8)Create a Java program that takes any number of user inputs
// and calculates their average. 

	/*		
			 int num = 0; 
			 int x = 1; 
			 int numValue = 0;
			 
			System.out.println("Input the number of numbers (n) you want to use to calculate the average");
			int n = sc.nextInt(); 
			
			while ( x <= n) {
				x++;
				num++; 
				
			System.out.println("Input number: ("+num+")");	
			numValue += sc.nextInt();
			}
			
			int average = (numValue / n);
			System.out.println("average: " + average);

*
*
*/	//Task complete ^_^ Note(When you want user input values to be added to one another, use " int num +=sc.nextInt(); " 
			
			
			
// 9)Write a java program to swap to variables: 
			
		/*	System.out.println("Numbers swap program: ");
			
			int x = 0; 
			int y = 0; 
			
			System.out.println("Enter the value for x");
			x = sc.nextInt();
			
			System.out.println("Enter the value for y");
			y = sc.nextInt(); 
			
			System.out.println("x ="+x);
			System.out.println("y = "+y);
			
			System.out.println("After swapping, x = "+y);
			System.out.println("And y = "+x );
			
			*/
		// 10)Write a java program to determine if a number is an even number 
			
		    /* System.out.println("Please enter a value for x");
			int x = 0;
			
			x = sc.nextInt(); 
			
			
			if (x % 2 == 0) {
				System.out.println("It is an even number");
			}else {
				System.out.println("It's an odd number.");
			}
		
		
		*/
			
			
        // 11)make a program that will determine the largest number out of three. 			
			
		/*	int a,b,c, largestNumber;
			
			System.out.println("Enter the first numb");
			a = sc.nextInt(); 
			System.out.println("Enter the second number");
			b = sc.nextInt(); 
			System.out.println("Enter the third number");
			c = sc.nextInt(); 
			
		
		
			if ( a >= b && a >= c) {
				largestNumber = a;
			} else if ( b >= a && b >= c) {
				largestNumber = b;
			}else {
				largestNumber = c;
				}
			System.out.println("The largest number is:" + largestNumber);
			
			*///Program success, it works ^_______^  !!!
			
			
			//12)Write a q/a quiz program in Java. he user needs to answer a question: "What is the command keyword to exit loop in Java?"
			//The user has the option to try to guess the answer three times total. 
			// the user gets a correct/incorrect output based upon their answer. 
			
			
		/*	a = "int";
			b = "Continue";
			c = "Break"; 
			d = "Exit"; 
		*/
		/*	System.out.println(" What is the exit command keyword prompt for java? A. B. or C.?");
			
		char answer = sc.next().charAt(0);
			
		if (answer == 'c') {
				System.out.println("Correct!");
		}else {
		for ( int answerNumber = 1;answer != 'c' && answerNumber < 3; answerNumber++) { // we used answerNumber variable to count the number of answers behind the scenes 
			System.out.println("try again");                          // and set the condition that if answer is not C
	         answer = sc.next().charAt(0);                       // and not a third answer attempt, then the prompt try again would show.
					}                                            //after three tries, the loop ends and the next instruction is read
		System.out.println("You failed to answer within three tries."); // namely this instruction. 
				
			}
			
			*///The code works, happy with it ^______________^ 
			
			
			
			//13) Write a Java program to find the average of the student's grades, knowing that the number of student's
	        // and the number and the number of student courses shall be given by the user
		    // Notes: The numbers of students should be more than zero and grades should range between 0-100. 
		   
		
		int gradenumb, studentnumb, x; 
		char grade ='0';
		
		
		
		/*System.out.println("Enter the number of students");
		studentnumb = sc.nextInt();
		
		
		for ( studentnumb=1,x = 0; studentnumb >= x; x++ ) {
			System.out.println("Enter the grade for the student");
			gradenumb = sc.nextInt(); 
	    if ( gradenumb <= 59 ) {
			grade = 'F'; 
		} else if (gradenumb <= 69) {
			grade = 'D'; 
		}else if (gradenumb <= 79) {
			grade = 'C'; 
		}else if (gradenumb <= 89) {
			grade = 'B';
		}else if ((gradenumb > 89 || gradenumb == 100) && (gradenumb < 101 )) {
			grade = 'A';
		}else if (gradenumb > 100) {
			System.out.println("The grade entered is not of the appropriate (1-100) range");
		} 
		System.out.println(grade); 
		break;
		}
		*/	
		 
		
		
		
		
		
		
		}	
			
		}	

	}
		

		

			
	


