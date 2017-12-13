import java.util.Scanner;
public class CountingFor 
{
	public static void main(String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println( "Type in a message, end i'll display it five times");
		System.out.println( "Message: ");
		String message = keyboard.nextLine();
		
		for ( int n = 1; n <=5 ; n= n+1 )
		{
			System.out.println( n + ". " + message );
		}
	}
	
	

}
