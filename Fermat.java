import java.util.Scanner;
public class Fermat {


  
  public static double degree(int z, int n){
   return Math.pow (z,n);
}


  public static void main(String[] args){
	  System.out.println("Enter number for a, b, c, and n bigger than 2.");
	  Scanner in = new Scanner(System.in);
      int a = in.nextInt();
      int b = in.nextInt();
      int c = in.nextInt();
      int n = in.nextInt();
              
  // Math.pow(a, n) can be more efficient 
  if(degree(a,n) + degree(b, n) == degree(c, n)){
   System.out.println("Holy smokes, Fermat was wrong!");
  } else{
   System.out.println("No, that doesn’t work.");
}
}
}
