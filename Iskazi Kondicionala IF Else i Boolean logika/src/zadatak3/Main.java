package zadatak3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try(Scanner sc = new Scanner(System.in))
{

	//Napraviti bankarski program koji odredjuje uslov da klijet ima minimum primanja
	//odredjene vrednosti ili (||) da ima 18 godina. 
	
	//Vrednosti koje biram kao ucenik da koristim su sledece:
	// int age = 18              int age = sc.newInt();
	//double salary = 300.69     double salary = sc.newDouble();
	//Vrednosti predate tipu varijable su samo placeholder i totalno random. 
	
	System.out.println("Credit liability evaluation"); 
	
	System.out.println("Please enter your age: "); 
	int age = sc.nextInt(); 
	
	System.out.println("Please enter your salary, you may use double decimal: ");
	double salary = sc.nextDouble(); 
	
	System.out.println("The age you have entered is: " + age); 
	System.out.println("The salary you have entered is: " + salary); 
	
	if( age == 18 || salary > 300.69)
	{System.out.println("Your credit has been approved!");}
	else 
	{System.out.println("Your credit has been denied");} 
	
	//Success ^________^ !!! It workS! 
	
	}
	

}
	}


