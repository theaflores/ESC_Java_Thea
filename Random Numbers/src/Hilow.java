import java.util.Random;
import java.util.Scanner;

public class Hilow
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		Random r = new Random();
		int x = 1 + r.nextInt(10);
		int guessrannum, rannum;
		
		System.out.println("I am thinking of a number between 1-100. Try to guess it!");
		guessrannum = keyboard.nextInt();
		
		rannum = 1 + r.nextInt(100);
		
		System.out.println("I was thinking of " + rannum + "");
		
		if (rannum<guessrannum)
		{
			System.out.println("Your guess was too high!");
		}
		if (rannum>guessrannum)
		{
			System.out.println("Your guess was too low!");
		}
		 if  (rannum == guessrannum)
		{
			System.out.println("You guessed it! you're a good guesser!");
		}
		 keyboard.close();
	}

}
