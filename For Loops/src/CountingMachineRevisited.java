import java.util.Scanner;
public class CountingMachineRevisited 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in) ;
		int num;
		int countby;
		int countfrom;
		
		System.out.println("count from: ");
		countfrom = keyboard.nextInt();
		
		System.out.println("count to: ");
		num = keyboard.nextInt();
		
		System.out.println("count by: ");
		countby = keyboard.nextInt();
		
		for (int n = countfrom; n <= num; n = n + countby)
		{
			System.out.print(n + " ");
			keyboard.close();
		}
	}
		
}