/* Steven Cisneros
 * CIS183-25718-LEC
 */

import java.util.Scanner; 
import java.util.Random;

public class RockPaperScissors {
	
	public static void RPS() 
	{
		Scanner in = new Scanner (System.in);
		
		Random rps = new Random();
		
		String person;
		
		String computer = "";
		
		int computerChoice = rps.nextInt(3)+1;
		
		if (computerChoice == 1)
			computer = "Rock";
		else if (computerChoice == 2)
			computer = "Paper";
		else if (computerChoice == 3)
			computer = "Scissors";
		
		System.out.println("Enter Rock, Paper or Scissors: ");
		person = in.next();
		
		person = person.substring(0,1).toUpperCase() + person.substring(1).toLowerCase();
		
		System.out.println("Computer's choice: " + computer);
		
		if (person.equals(computer)) 
		{
			System.out.println("Tie");
		}
		else if (person.equals("Rock")) 
		{
			if (computer.equals("Scissors"))
				System.out.println("Rock beats Scissors, You Win!");
			else if (computer.equals("Paper"))
				System.out.println("Paper beats Rock, You Lose D:");
		}
		else if (person.equals("Paper")) 
		{
			if (computer.equals("Scissors"))
				System.out.println("Scissors beats Paper, You Lose D:");
			else if (computer.equals("Rock"))
				System.out.println("Paper beats Rock, You Win!");
		}
		else if (person.equals("Scissors")) 
		{
			if (computer.equals("Paper"))
				System.out.println("Scissors beats Paper, You Win!");
			else if (computer.equals("Rock"))
				System.out.println("Rock beats Scissors, You Lose D:");
		}
		
	}

	public static void main(String[] args) 
	{
		Scanner in = new Scanner (System.in);
		
		boolean restart = true;
		
		while(restart) 
		{
			RPS();
			
			String answer;
			
			System.out.println ("Would you like to continue playing?(Yes/No) ");
			answer = in.next();
			
			answer = answer.substring(0,1).toUpperCase() + answer.substring(1).toLowerCase();
			
			if (answer.equals("Yes")) 
				restart = true;
			else
				restart = false;
			}
		}
		
		
		
	}


