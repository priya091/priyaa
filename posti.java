import java.util.Scanner;

public class JavaApplication2 {

    
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int n;
        System.out.println("enter the number:");
        n=scan.nextInt();
      
            if(n==0)
            System.out.print("number is zero");
           else if(n<0)
                 System.out.print("number is negative");
            else
              System.out.print("number is positive"); 
                
        }
}