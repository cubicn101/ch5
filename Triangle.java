import java.util.Scanner;

public class Triangle{
   
   public static void main(String[]args){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the length of stick A ");
     int a = in.nextInt();
     
     System.out.println("Enter the length of stick B");
     int b = in.nextInt();
    
     System.out.println("Enter the length of stick C");
     int c = in.nextInt(); 
     // assmue they are all integers
     if (a<=0 || b <=0 || c <= 0){
		 System.out.println("side must be positive! :(");
		 }else if (a+b>c && a+c>b && b+c >a){
         System.out.println("A triangle is formed ;)");
         		
		}else{
	 System.out.println(" No triangle formed. TT");
	}

}
}
