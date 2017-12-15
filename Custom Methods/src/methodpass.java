import java.util.Scanner;

public class methodpass 
{
	 public static void main( String[] args ) throws Exception
	    {
	        Scanner keyboard = new Scanner(System.in);
	      int number;
	      System.out.println("Pick a numer between 1-100: ");
			number = keyboard.nextInt();
	        
	       
	        	 if (number% 3== 0)
	 	        {
	 	        	 System.out.println("I like that number!") ;
	 	        } 
	         else
	        	 {
	        		 System.out.println("That number is gross...") ;
	        	 }
	        	
	        
	        
	      
	    }
	        
	    
}

