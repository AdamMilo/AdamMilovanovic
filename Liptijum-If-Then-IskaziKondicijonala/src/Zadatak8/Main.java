package Zadatak8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try(Scanner sc = new Scanner(System.in)){
	
	/* Napisati uslove programa koji daju dozvolu pristupu drustvenoj mrezi samo osobama koje:
	 * da ima obezbedjen stalan pristup internetu, 
	 * da ima elektronski uredjaj (recimo laptop neophodan za pouzdanu f-ju aplikaciju ove mreze)
	 * da ima najmanje 12 god
	 */
	
	System.out.println("Thank you for applying for the schools language teaching social network");
	System.out.println("First we must check if you meet the requirements for becoming a working teacher at our community");
	System.out.println("So just relax, take a drink, and answer these questions truthfully.");
	System.out.println("Ready? I hear a Yes! So, let's begin!");
	
	System.out.println("Are the following statements true or false?");
	
	System.out.println("I have a stable and accessible internet connection?");
	boolean hasInternet = sc.nextBoolean();
	
	System.out.println("I have a a laptop devise available as for use of teaching online classes");
	boolean hasLaptop = sc.nextBoolean(); 
	
	System.out.println("See, now that wasn't so bad ;) One more question to go!");
	
	System.out.println("Please enter your age:");
	int age = sc.nextInt(); 
	
	if( hasInternet && hasLaptop && age >= 12 )
	{System.out.println("You are eligible for becoming a teacher in our online community! WELCOME! ^___^");}
	else
	{System.out.println("We are sorry, but you are not eligible for becoming a teacher with us. Better luck next time ;) ");}
	
	
	
	//Super basic program, radi ono sto treba da radi, obe promenljive, osim godina, su boolean, dok su godine integer. 
	// Idemo dalje ^______^ 
	
	
	
	
	
	
	
}
	}

}
