
import java.util.Scanner;

public class ALittleQuiz
	{
		public static void main(String[] args)
		{
			Scanner keyboard = new Scanner(System.in);
			
			String name;
			int capaka;
		
			System.out.println("Please enter your name. ");
			name = keyboard.next();
			
			System.out.println("What is the capital of Alaska? ");
			System.out.println("1). Juno ");
			System.out.println("2) Juneau ");
			System.out.println("3) Lido ");
			System.out.println("4) Aska ");
			capaka = keyboard.nextInt();
		
			if ((capaka < 2) || (capaka > 2 ))
			{
				System.out.println("That is incorrect. The correct answer is Juneau.");
			}
			else 
			{
				System.out.println("Correct.");
			}
			System.out.println("Are teenagers lazy based on research?");
			System.out.println("1).No, no teenagers are lazy.");
			System.out.println("2) No, it's because they're body will always be tired because it is in constant over drive until the age of 23.");
			System.out.println("3)  yes, all of them are lazy for no reason.");
			System.out.println("4) School is mentally draining. ");
			capaka = keyboard.nextInt();
		
			if (capaka < 2) 
			{
				System.out.println("That is incorrect. The correct answer is 2 or B.");
			}
			else 
			{
				System.out.println("Correct.");
			}
			System.out.println("What is the most popular doughnut flavor? ");
			System.out.println("1). Chocolate ");
			System.out.println("2) Raspberry Jelly ");
			System.out.println("3) Glazed ");
			System.out.println("4) Apple ");
			capaka = keyboard.nextInt();
		
			if ((capaka < 3) || (capaka > 3 ))
			{
				System.out.println("That is incorrect. The correct answer is Glazed.");
			}
			else 
			{
				System.out.println("Correct.");
				System.out.println(" Thank you " + name + " for taking this little quiz!");
				
				keyboard.close();
			}
		}
	}


