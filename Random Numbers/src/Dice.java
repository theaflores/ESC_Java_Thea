
import java.util.Random;

public class Dice
{
	public static void main(String[] args)
	{
		Random r = new Random();
		int x = 1 + r.nextInt(10);
		int d1,d2,add;
		
		d1 = (1 + r.nextInt(6));
		d2 = (1 + r.nextInt(6));
		
		System.out.println("Dice 1: "); 	System.out.println(d1 + "");
		System.out.println("Dice 2: "); 	System.out.println(d2 + "");
		
		add = d1 + d2;
		
		System.out.println("The sum of the random numbers are " + add + ".");
		
		
	}
	
}
