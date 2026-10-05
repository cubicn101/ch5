import java.util.Scanner;
import java.util.Random;

public class GuessMyNumber {


   public static void main(String[] args){
   Scanner in = new Scanner(System.in);
   System.out.println("Enter a number");
  
       Random random = new Random();
       int number = random.nextInt(100) + 1;
   
          int guess = in.nextInt();
          int off = number - guess;
          
       if(guess == number){
      System.out. print ("You are right!");
     
    }else if( guess > number){
		System.out.println( "lower");
		
	}else{
		System.out.println("Higher");
		// first guess
	   Scanner SecIn = new Scanner(System.in);	
	   System.out.println("Second guess?");
	   int SecGuess = SecIn.nextInt();
	   
		  if( SecGuess == number){
      System.out. print ("You are right.");
     
    }else if(  SecGuess > number){
		System.out.println( "lower");
		
	}else{
		System.out.println("Higher");
		// SECOND GUESS
		
	Scanner ThirdIn = new Scanner(System.in);	
	   System.out.println("Third guess?");
	   int ThirdGuess = ThirdIn.nextInt();
	   
		  if( ThirdGuess == number){
      System.out. println("You are FINALLY right.");
   
	}else{
    System.out.print("haha, you are off by " + off);
}
   }
}
}
}


  
