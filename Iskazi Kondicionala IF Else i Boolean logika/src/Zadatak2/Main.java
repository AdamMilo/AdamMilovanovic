package Zadatak2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try(Scanner sc = new Scanner (System.in))
{
	
	//Ovde zelimo da napravimo program koji ce da dozvoli kredit samo ukoliko se ispune
	//sledeca dva uslova: da je plata veca od 300.59 i da je osoba zenskog pola. 
	
	//tipovi varijabli koje da koristim kao input za skener su sledeci
	//Char gender = sc.next().charAt(0); 
	//Double salary = sc.nextDouble(); 
	
	System.out.println("Please enter your gender: M or F ");
	
	char gender = sc.next().charAt(0); 
			
	
    System.out.println("Please enter your salary: ");
    
    double salary = sc.nextDouble(); 
    
   
    
    if( salary > 300.56 && gender == 'F')
    {System.out.println("Your credit loan has been approved!");}
    else
    {System.out.println("Your credit loan has been denied.");} 
	
  //Success ^________^ !!! It workS!





}
	}

	}
