
package tutorial;

import java.util.Scanner;

public class SumOfNaturalNumber
{
    public static void main(String[]arg)
    {
      int n;
      int sum=0;
      
      System.out.print("Enter the range of the number : ");
      Scanner in= new Scanner(System.in);
      n=in.nextInt();
      for(int i=1;i<=n;i++)
      {
        sum+=i;
      }
      System.out.print("Sum of all number from 1 to"+n);
      System.out.println(" is :"+sum);
    }
}
