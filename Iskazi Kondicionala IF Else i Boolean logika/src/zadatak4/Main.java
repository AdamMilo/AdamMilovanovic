package zadatak4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try(Scanner sc = new Scanner(System.in))

{
//Zadatak4: Napraviti bankarski program koji odredjuje uslov da:
//(opciono) Da klijent mora da bude zensko
//Klijent ima minimum primanja odredjene vrednosti ili (||) da ima 18 godina ili vise od 18god.
	
//Ucenik: U ovom zadatku biram da koristim sledeci tip varijabli za ulaz(input) 
//Za minimum primanja sam izabrao double vrednost: 250.25
// int age = sc.nextInt(); 
//	double salary = sc.nextDouble();  
// Char gender = sc.next().charAt(0);
	
	System.out.println("Credit Liability evaluator");
	
	System.out.println("Please enter your gender: 'M' or 'F'"); 
	char gender = sc.next().charAt(0);
	
	if(gender =='F' || gender =='f' )
	{System.out.println("Please enter your salary: ");}
	else 
	{System.out.println("Your are not eligible for a credit loan.");} 
	
	double salary = sc.nextDouble(); 
	
	
	System.out.println("Please enter your age: "); 
	
	int age = sc.nextInt(); 
	
	System.out.println("Your salary is: " + salary); 
	System.out.println("Your age is: " + age);
	
	if( salary >= 250.25 || age >=18 )
	{System.out.println("Your credit has been approved!");} 
	else
	{System.out.println("Your loan has been denied");} 
	
	


//Success, the code works!! ^_________^
} 
	}

}
