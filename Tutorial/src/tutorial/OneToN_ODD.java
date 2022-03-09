
package tutorial;
import java.util.Scanner;

public class OneToN_ODD 
{  
      public static void main(String[]arg)
    {
      int n;
      System.out.print("Enter the number : ");
      Scanner in = new Scanner(System.in);
      n=in.nextInt();
      System.out.println("All odd nbumbers from 1 to "+n);
      
      for(int i=1;i<=n;i=i+2)
      {
         System.out.print(" "+i);
      }
    }
}
