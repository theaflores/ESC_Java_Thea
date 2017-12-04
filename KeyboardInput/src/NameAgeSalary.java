import java.util.Scanner;
public class NameAgeSalary 
{
	
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String name, age, salary, salaryP;
	
		
		System.out.println("Hello,what is your name? " );
		name = keyboard.next();
		
		System.out.println("Hello, " + name + " how old are you? " );
		age = keyboard.next();
		
		System.out.println("So you are," + age + " I guess that's not too old, " + name + " How much do you make per hour?" );
		salary = keyboard.next();
		salaryP = salary + .0;
				
		System.out.println("Wow!" + salaryP + " is a lot for your age! " );
		
		keyboard.close();
		
		
		
		
	}

}
