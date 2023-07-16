import java.util.Scanner;
public class TestScoreApp
{
	public static void main (String[] args)
	{
		//display operational  messages
		System.out.println ("please enter test scores that range from 0 to 100.");
		System.out.println("to end the program enter 999.");
		System.out.println(" "); 
		// print a blank line
		// initialize variables and create a scanner object
		double scoreTotal =0.0;
		int scoreCount = 0;
		int testScore = 0;
		Scanner sc = new Scanner(System.in);
		// get a series of test scores from the user
		while (testScore <=100)
		{
		// get the inbput from the user
		System.out.println("enter Score ");
		testScore = sc.nextInt();
		// accumulate score count and score total
		  if (testScore <=100)
		   {
		   scoreCount = scoreCount + 1;
		   scoreTotal = scoreTotal + testScore;
		     }
		// displays the score count. score total, and average score
		double averagescore = scoreTotal/scoreCount;
		String message = "/n" 
		+ "Score Count:" + scoreCount + "\n"
		
		+ "Score Total:" + scoreTotal + "\n"
		+ "average score:" + averagescore + "\n";
		System.out.println(message);
		}
		}
	}
