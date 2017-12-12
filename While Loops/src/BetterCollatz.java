import java.util.Scanner;


public class BetterCollatz {

    public static void main(String[] args) {

            Scanner keyboard = new Scanner(System.in);

            System.out.print("Starting Number: ");
            int n = keyboard.nextInt();
            int counter = 0;
            int stepsTaken = 0;
            int largestNumber = 0;
            System.out.println("LETS PLAY COLLATZ");
            
            System.out.println("Rules:");
            
            System.out.println("If the number is even, divide it by two.");
            
            System.out.println("If the number is odd, Multiply by 3 and add 1");
            
            System.out.println("Repeat this decision until you reach 1");
            
            while ( n != 1 ){
                    if ( ( n & 1 ) == 0 ) {
                            System.out.print( (n = ( n / 2 )) + " " );
                            stepsTaken++;
                            counter++;
                    }       else {
                            System.out.print( (n = ( n * 3 ) + 1) + " " );
                            stepsTaken++;
                            counter++;
                    }

                    if ( n > largestNumber ){
                            largestNumber = n;
                    }

                    if (counter == 9){
                            counter = 0;
                            System.out.print("\n");
                    }
            }

            System.out.println();
            System.out.println("\nTerminated after " + stepsTaken + " steps.");
            System.out.println("The largest value was " + largestNumber + ".");
    }
}