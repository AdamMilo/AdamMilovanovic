package Zadatak6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try(Scanner sc = new Scanner(System.in))
{
//Napraviti bankarski program koji odredjuje uslov da klijent ima 
	//minimum primanja odredjene vrednosti
	// i (&&) da klijent nije zaposlen. 
	
	System.out.println("Welcome to the credit eligibility check");
	
	System.out.println("Please enter your salary: ");
	double salary = sc.nextDouble(); 
	
	System.out.println("Are you employed? (true/false)");
	Boolean isEmployed = sc.nextBoolean();
	
	System.out.println("Your entered salary: " + salary); 
	
	if (isEmployed)
	{System.out.println("Employed: yes.");} 
	else
	{System.out.println("Employed: no.");} 
	
	if ( salary >= 200.02 && isEmployed)
	{System.out.println("You are legible for a loan!");} 
	else 
	{System.out.println("Your loan request has been denied.");}
	












}
	}

}

