import java.util.Random;
import java.util.Scanner;

public class KeepGuessing 
{
	public static void main(String[] args)
	{
		
		Random randomNumber = new Random();
		  Scanner kbd = new Scanner(System.in);
		  int computerValue = randomNumber.nextInt(10);
		  int success = 0;
		  int guess = 0;


		   while (success ==0)
		     {
		        System.out.println("please enter an integer betwen 1 and 10: ");
		        guess = kbd.nextInt();
		        

		           if (guess < 1 || guess > 100){
		              System.out.println("Try again!");
		           }

		           else if (guess == computerValue){
		              success++;
		              System.out.println("Congratulations you won and the number was: " + computerValue);

		           }
		           else if (guess < computerValue){
		              System.out.println("Try again!!");
		           }
		           else if (guess > computerValue){
		              System.out.println("Try again!!");
		    }
		    }



		   }
		}