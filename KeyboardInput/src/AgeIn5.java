import java.util.Scanner;
public class AgeIn5 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		String name;
		int age, ageP, ageM;
		
		
		
	
		System.out.println("What is your name? " );
		name = keyboard.next();
		
		System.out.println( "How old are you? " );
		age = keyboard.nextInt();
		ageP = age +5;
		ageM = age -5;
		
		
 		System.out.println( "so you're name is " + name + " , you are " + age + " Did you know that 5 years ago you were " + ageM + " and in 5 years you will be " + ageP );
		
 		keyboard.close();
		
	
	}

}
