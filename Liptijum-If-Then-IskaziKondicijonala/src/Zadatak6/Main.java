package Zadatak6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(Scanner sc = new Scanner (System.in))
		
		{
			
		//Zadatak6: Napraviti bankarski program koji odredjuje uslov da
		//Kl/ijent ima minimum primanja odredjene vrednoosti 
			/* I && da je klijen zaposlen.
			 * Ucenik: Ovde biram da koristim sledece tipove varijabli: 
			 * Double salary = nextDouble(); 
			 * String isEmlployed = sc.next();
			 */
			
			System.out.println("Welcome to the credit loan legibility query");
			
			System.out.println("Are you emlployed? (yes/no)");
	        String isEmployed = sc.next(); 
	        
	        if( isEmployed.equals("Yes") || isEmployed.equals("yes") )
	        {System.out.println("Please Enter your salary");}
	        
	        else if( isEmployed.equals("No") || isEmployed.equals("no")) 
	        {System.out.println("You must be employed to be legible for a loan.");}
	        
	        else
	        {System.out.println("The system only accepts a yes/no answer to this query");} 
	        
			double salary = sc.nextDouble();
			
			System.out.println("Thank you kindly for your input");
			System.out.println("Your salary is: " + salary );
			System.out.println("Employed: " + isEmployed );
			System.out.println("The system will now calculate your legibility for a loan");
			
			if(salary >=250 && isEmployed.equals("yes"))
			{System.out.println("Excellent, your credit loan has been approved!");}
			
			else if(salary >=250 && isEmployed.equals("Yes"))
			{System.out.println("Excellent, your credit loan has been approved! ^_^");}
			
			else
			{System.out.println("We are sorry, but your credit loan has been denied. :( ");}
			
			
			//Sigurno moze da se pise sa manje koda, ali funkcionise okej ^_____^
			// U sustini sam izabrao string za striktno Yes/no (sve ostalo ne prihvata sistem
			//, i pisao sam if kondocionale
			// tj duplikate uslova, za input Yes(veliko Y) i za input yes (malo y) 
			//isto sam uradio i za input "no"/"No" tako da se daju isti rezultati bez obzira
			//da li je korisnik kucao velikim prvim slovima.
			// ali je ne efikasno dupliranje if-f-je, to je sa onim sto znam da se snadjem
			//na brzinu ^_______^. 
			
			
			
			
		}

	}

}
