import java.util.Random;
import java.util.Scanner;

public class RandomnessChange
{
	@SuppressWarnings("resource")
	public static void main ( String[] args )
	{
		Random r = new Random();
		Rand item = new Rand();
		String response = "";
		String answer = "Y";
		String question = "";
		Scanner sc = new Scanner (System.in);
			
		while (answer.equalsIgnoreCase("Y"))
		{		
	
		System.out.println("What do you want to know?  ");
		question = sc.nextLine();
		
		int choice = 1 + r.nextInt(20);
		if ( choice == 1 )
			response = "It is certain";
		else if ( choice == 2 )
			response = "It is decidedly so";
		else if ( choice == 3 )
			response = "Without a doubt";
		else if ( choice == 4 )
			response = "Yes - definitely";
		else if ( choice == 5 )
			response = "You may rely on it";
		else if ( choice == 6 )
			response = "As I see it, yes";
		else if ( choice == 7 )
			response = "Most likely";
		else if ( choice == 8 )
			response = "Outlook good";
		else if ( choice == 9 )
			response = "Signs point to yes";
		else if ( choice == 10 )
			response = "Yes";
		else if ( choice == 11 )
			response = "Reply hazy, try again";
		else if ( choice == 12 )
			response = "Ask again later";
		else if ( choice == 13 )
			response = "Better not tell you now";
		else if ( choice == 14 )
			response = "Cannot predict now";
		else if ( choice == 15 )
			response = "Concentrate and ask again";
		else if ( choice == 16 )
			response = "Don't count on it";
		else if ( choice == 17 )
			response = "My reply is no";
		else if ( choice == 18 )
			response = "My sources say no";
		else if ( choice == 19 )
			response = "Outlook not so good";
		else if ( choice == 20 )
			response = "Very doubtful";
		else 
			response = "8-BALL ERROR!";

		System.out.println( "MAGIC 8-BALL SAYS: " + response );
		
		item.getThequestion().add(question);
		item.getTheanswer().add(response);
		if (answer.equalsIgnoreCase("N"))
		 	{
			System.out.println("EXIT");

		}
		else

		System.out.println("Do you want to continue: (Y/N/History)?  ");
		answer = sc.nextLine();
		}
		if (answer.equalsIgnoreCase("History"))
		{
				for(int i = 0; i<item.thequestion.size();i++)
			{
				
				System.out.println("Question:     " +item.thequestion.get(i));
		        System.out.println("Answer:       " +item.theanswer.get(i));
			}
		}
			
	}
	}
