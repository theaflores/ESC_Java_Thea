import java.util.Scanner;
public class Dumbcalculator 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		double Av, n1, n2, n3;
		
		System.out.print( "What is your First number?"); n1 = keyboard.nextDouble();
		System.out.print( "What is your Second number?"); n2 = keyboard.nextDouble();
		System.out.print( "What is your Third number?"); n3 = keyboard.nextDouble();
		Av= (n1+ n2+ n3) / 3.0;
		System.out.print( "The average of the three numbers is " + Av); 
		
		keyboard.close();
		
	}

}
