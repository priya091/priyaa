import java.util.Scanner;

public class JavaApplication3 {

   
    public static void main(String[] args) {
       Scanner scan =new Scanner(System.in);
       int n;
      System.out.print("enter the number:");
      n=scan.nextInt();
      if(n%2==0)
          System.out.print("number is even");
      else 
          System.out.print("number is odd");
      
               
    }
    
}