package zadatak5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

try(Scanner sc = new Scanner(System.in))
{
//Napraviti bankarski program koji odredjuje uslov da klijent ima minimum primanja
	// odredjene vrednosti (||) ili da ima preko 18 godina. 

	System.out.println("Welcome to the credit legibility query");
	
	System.out.println("Please enter your age: "); 
	int age = sc.nextInt(); 
	
	System.out.println("Please enter your salary, in double decimals: ");
	double salary = sc.nextDouble();
	
	System.out.println("Your age is: " + age); 
	System.out.println("Your salary is: " + salary); 
	
	if( age > 18 || salary >= 200)
	{System.out.println("Your loan has been approved!");}
	else 
	{System.out.println("Your loan has been denied.");} 
	
	//Success, the code works ^______^







}
	}

}
