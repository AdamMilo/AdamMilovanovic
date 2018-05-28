package sportsSelector;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try(Scanner sc = new Scanner(System.in)) {
	
	//(The program w accept those candidates that pass the criteria onto a list,
	//the list will state the player stats
	// the list will grow as long as candidates that apply pass the criteria
	//the program will at the end of the loop list the names and stats of all the players that pass.
	//The list (array) will list the players from top (best) to bottom (worst)
	
	//the program considers and compares stats' using reference  statistics from
	//https://sanzarrugby.com/superrugby/competition-stats/#playerstats
	// summing up the individual top 10 player statistics for each criteria
	// and calculating the average value of a top 10 player. 
	
	//the criteria for an average top 10 player are the following:
	// 1.carries: 137
	//2.clean breaks: 18
	//3.defenders beaten: 48
	//4.lineouts won: 44
	//5.offloads: 20
	//6.points:120
	//7.tackles won:141
	// 8.meters carried:839
	
	//The program will compare the average sum of the first 7 criteria points
	// with the average sum of the player's input points. 
	// to pass the first check the player must be equal to or greater than the sum of 1through7 of the average top player criteria
	// then, the program will compare the number 8. criteria, average and player scored.
	//if the player is equal to or greater than the average of 8th criteria he will pass the second check and make it to the list
	//
	String playername, playersurname;
	int cleanBreaks = 0, defendersBeaten = 0, lineoutsWon = 0, metersCarried = 0, offloads = 0,carries = 0, points = 0, tacklesWon = 0;
	
	System.out.println("How many applicants for the team?");
	int n = sc.nextInt(); 
	
	System.out.println("Enter the " + n + " applications");
	
	for (int y = 0; y < n; y++) {
		if (y == 0) {
	System.out.println("Enter player first name: ");
	playername = sc.next();} 
		else {
	System.out.println("Enter the next player first name: ");
	playername = sc.next();}
	
	System.out.println("Enter surname");
	playersurname = sc.next(); 
	
	
	System.out.println("Enter the number of clean breaks achieved ");
    cleanBreaks = sc.nextInt();
    
    System.out.println("Enter the number of defenders beaten");
	defendersBeaten = sc.nextInt(); 
	
	System.out.println("Enter the number of lineouts won");
	lineoutsWon = sc.nextInt(); 
	
	System.out.println("Enter the number of offloads taken");
	offloads = sc.nextInt(); 
	
	System.out.println("Enter the number of carries");
	carries = sc.nextInt(); 
	
	System.out.println("Enter the number of points won ");
	points = sc.nextInt(); 
	
	System.out.println("Enter the number of tackles won");
	tacklesWon = sc.nextInt(); 
	
	System.out.println("Enter the number of meters carried:");
	 metersCarried = sc.nextInt(); 
	
	if (carries < 137 && cleanBreaks < 18 && defendersBeaten < 48 && lineoutsWon < 44 && offloads < 20 && points < 120 && tacklesWon < 141 && metersCarried < 839  )
	
	{System.out.println("The applicant"+ (y + 1) +": " + playername +" "+playersurname+" does not met the top 10 player criteria");
	} 
	
	else {
		 System.out.println("Applicant "+ (y + 1 ) + ":" + playername + " "+playersurname); 
		 System.out.println("Player statistics: ");
		 System.out.println("Carries: "+ carries);
		 System.out.println("Clean breaks: " + cleanBreaks);
		 System.out.println("Defenders beaten:" + defendersBeaten);
		 System.out.println("Lineouts won:" + lineoutsWon);
		 System.out.println("Offloads: " + offloads);
		 System.out.println("Points:" + points);
		 System.out.println("Tackles won: " + tacklesWon);
		 System.out.println("Metres carried:" + metersCarried);
		
	 }
	}
	 System.out.println("Thank you for applying with us");
	 
	 
	 
	 
}
	}

}
