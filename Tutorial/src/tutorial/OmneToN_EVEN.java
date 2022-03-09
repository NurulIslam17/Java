
package tutorial;
import java.util.Scanner;


public class OmneToN_EVEN
{
    public static void main(String[]arg)
    {
      int n;
      System.out.print("Enter the number : ");
      Scanner in = new Scanner(System.in);
      n=in.nextInt();
      System.out.println("All even nbumbers from 1 to "+n);
      
      for(int i=2;i<=n;i++)
      {
         System.out.print(" "+i);
         i++;
      }
    
    }
}
