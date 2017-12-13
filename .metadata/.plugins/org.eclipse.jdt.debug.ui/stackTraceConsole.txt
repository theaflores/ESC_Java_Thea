import java.util.Random;
import java.util.Scanner;

public class HiLowLimited
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		Random r = new Random();
		int x = 1 + r.nextInt(10);
		int guessrannum, rannum;
		int tries = 0;
		
		System.out.println("I am thinking of a number between 1-100. Try to guess it!");
		guessrannum = keyboard.nextInt();
		tries++;
		
		rannum = 1 + r.nextInt(100);
		
		
		while (rannum != guessrannum && tries < 7 )
		{
			System.out.println("That is incorrect. Guess Again!");
			guessrannum = keyboard.nextInt();
			tries++;
		}
		
		 if  (rannum == guessrannum)
		{
			System.out.println("You guessed the correct number. Congrats!");
		}
		 else if ( tries >= 7 )
			 System.out.println("I was thinking of " + rannum + "");
				System.out.println("\nSorry you didn't guess it in 7 tries. Start again.");
	}

}
