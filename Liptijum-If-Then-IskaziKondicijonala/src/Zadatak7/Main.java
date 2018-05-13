package Zadatak7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try(Scanner sc = new Scanner(System.in)){
	
	//Zadatak7:Napraviti bankarski program koji odredjuje uslov da klijent ima 
	//minimum primanja odredjene vrednosti i (&&) da klijent nije dete. 
	/* 
	 * Ucenik: Ovde biram da koristim sledece tipove varijabli: 
	 * boolean isChild = sc.nextBoolean(); 
	 * double salary =sc.nextDouble(); 
	 */
	
	
	System.out.println("Welcome to the credit loan eligibility query!");
	
	System.out.println("Please answer the following questions truthfully:");
	
	System.out.println("Is the following statement true/false?(Enter: True/False)");
	
	System.out.println("You are under 18");
	Boolean isChild = sc.nextBoolean();
	if(isChild)
	{System.out.println("We are sorry, only adults are legible for a loan");}
	else 
	{System.out.println("Please enter your salary:");}
	Double salary = sc.nextDouble(); 
	 
	System.out.println("Please enter your age: ");
	int age = sc.nextInt();
	
	if(age >= 18)
	{System.out.println("You are age eligible for a loan");}
	else if (age < 18)
	{System.out.println("The system indicates you are underage. You did not answer the first question truthfully, which is very naughty!");}
	System.out.println("Your entered salary is: " + salary);
	System.out.println("Your age is: " + age);
	
	
	if ( salary >=200) 
	{System.out.println("Your earnings are sufficient");}
	
	if( age < 18) 
	{System.out.println("Expert opinion: Your are not eligible for a credit loan. Your age input indicates you are a child");}
	else if (salary <200)
	{System.out.println("Expert opinion: Your are not eligible for a credit loan. You have an inssuficient salary.");}
	
	
	
	if ( salary >= 200 && age >= 18) 
	{System.out.println("Your are eligible for a loan!");} 
	
	
	
	
	
	
	/* 
	 * Program treba u dva navrata da potvrdi da li je klijent dete 
	 * pri tome, ako je klijent odbijen, treba da mu objasni zasto je odbien
	 * Klijent treba da razume tacno zasto je odbijen,
	 * zato sistem mora da potvrdi klijentu koje uslove ispunjava, ako postoje. 
	 * I finalno treba samo da pusta one klijente koji ispunjavaju sledeca dva uslova: 
	 * Da im je plata >= 200 
	 * I da nisu dete. 
	 * Zabavan programcic, i funkcionise okej, dok god imate mene da vam govorim sta da kucate xD 
	 * Testiran na uzoj rodbini :3 
	 */
	
	
	}
	}

	}
