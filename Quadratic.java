import java.util.Scanner;

public class Quadratic{
   
   public static void main(String[]args){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter A");
     int a = in.nextInt();
     
     System.out.println("Enter B");
     int b = in.nextInt();
    
     System.out.println("Enter C");
     int c = in.nextInt(); 
     // assmue they are all integers
     
     double d = (double) b*b -4.0 *a*c;
     if(d<0){
		 System.out.println("no real solution");
		 }else{
			 double x1 = (-b+Math.sqrt(d))/2*a;
			 double x2 = (-b-Math.sqrt(d))/2*a;
			 System.out.println("The answers are" + x1 + "and" +x2);
	 }		 
   }
}
