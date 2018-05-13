package Zadatak1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Zadatak1 Napraviti program koji na osnovu plate odredjuje da li banka moze 
		//Isplatiti klijentu kredit
    	//simple, only the salary is the condition and it must be larger than 300$ for the 
		//credit to be approved. 
		try(Scanner sc = new Scanner(System.in))
		{
	        
		
		
		System.out.println("Please enter your salary");
		
		
		int salary = sc.nextInt();
		
		System.out.println("The system will now calculate your credit legibility...");
			
		if (salary > 300)
		{System.out.println("Your loan has been approved!");}
		else
		{System.out.println("We are sorry but your creddit loan has been denied");} 
		
		//Success ^________^ !!! It workS!
	}
		}
}
