import java.util.Scanner;
public class UserInputofData 
{
	public static void main(String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		String FN, LN, G, SID, LI, GPA;
		
		FN= "First Name";
		LN= "Last Name";
		G= " Grade(9-12)";
		SID= "Student ID";
		LI= "Login";
		GPA= "GPA";
		
		System.out.println("Please enter the following information so I can sell it for a profit!" );
		
		System.out.print( "First Name:" ); FN = keyboard.next();
		System.out.print( "Last Name:" );LN = keyboard.next();
		System.out.print( "Grade(9-12):" );G = keyboard.next();
		System.out.print( "Student ID:" );SID = keyboard.next();
		System.out.print( "Login:" );LI = keyboard.next();
		System.out.print( "GPA 0.0-4.0:" );GPA = keyboard.next();
		System.out.println( "Your information:");
			System.out.println("                Login: " + LI     );
			System.out.println("                ID: " + SID       );
			System.out.println("                Name: " + FN + LN );
			System.out.println("                GPA: " + GPA      );
			System.out.println("                Grade: " + G      );
			
		
		keyboard.close();
		
	}

}
