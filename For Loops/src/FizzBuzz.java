import java.util.Scanner;

public class FizzBuzz 
{
	 public static void main( String[] args ) throws Exception
	    {
	        Scanner keyboard = new Scanner(System.in);
	      
	        
	        for (int n=1 ; n <=100 ; n = n + 1  )
	        {
	        	 if (n% 3== 0)
	 	        {
	 	        	 System.out.println("Fizz") ;
	 	        }
	        	 if (n% 5== 0)
		 	        {
		 	        	 System.out.println("Buzz") ;
		 	        }
	        	 if ((n% 3== 0) && (n% 5== 0))
		 	        {
		 	        	 System.out.println("FizzBuzz") ;
		 	        }
	        	 else
	        	 {
	        		 System.out.println(n) ;
	        	 }
	        	
	        }
	        
	      
	    }
	        
	    
}

