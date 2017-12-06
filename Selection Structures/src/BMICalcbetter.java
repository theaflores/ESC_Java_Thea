import java.util.Scanner;

public class BMICalcbetter 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		double heightfm,heightf,weightp,weightk,bmi,heighti,heightim,heightm;
	
		System.out.println("BMI (Body Mass Index) is a way of representing your size!");
		
		System.out.println("How many feet are you? ");
		heightf = keyboard.nextDouble();
		
		System.out.println("How many inches? ");
		heighti = keyboard.nextDouble();

		System.out.println("How many pounds do you weigh? ");
		weightp = keyboard.nextDouble();

		weightk = weightp * .4536;
		heightfm = heightf * .3048;
		heightim = heighti * .0254;
		
		heightm = heightfm + heightim;
		
		bmi =( weightk /( heightm * heightm));
		System.out.println("Your BMI is" + bmi + ".");
	
		if (bmi<18.5)
		{
			System.out.println("You're underweight.");
		}
		if ((bmi<24.9) && (bmi>18.5))
		{
			System.out.println("You're normal weight.");
		}
		if ((bmi<29.9) && (bmi>25.0))
		{
			System.out.println("You're overweight.");
		}
		if (bmi>30.0)
		{
			System.out.println("You're obese :)");
		}
	keyboard.close();
	}

}
