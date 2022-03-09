
package tutorial;

import java.util.Scanner;

public class Even_Odd_Check
{
    public static void main(String[]arg)
    {
      int number;
      System.out.print("Enter the number : ");
      Scanner input=new Scanner(System.in);
      number=input.nextInt();
      
      if(number%2==0)
      {
          System.out.println(number+" is an even number");
      }
      else
      {
          System.out.println(number+" is an odd number");
      }
    }
}
