import java.util.Scanner;

public class Howoldspecifically
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		String name;
		int age; 
		
		
		System.out.println("What is your name? ");
		name = keyboard.next();
		
		System.out.println("How old are you? ");
		age = keyboard.nextInt();
		

		if (age < 16)
		{
			System.out.println("You cannot drive. ");
		}
		if ( ( age < 18) && (age >15) )
		{
			System.out.println("You can drive but not vote. ");
		}
		if ( ( age < 24) && (age >18) )
		{
			System.out.println("You can vote but not rent a car. ");
		}
		if ( age > 24)
		{
			System.out.println("You can pretty much do whatever you want. ");
		}
	
	keyboard.close();
	}

}
