
package tutorial;

import java.util.Scanner;

public class If_Else_Java 
{
    public static void main(String[]arg)
    {
      int number;
      System.out.print("Enter the number : ");
      Scanner input=new Scanner(System.in);
      number=input.nextInt();
      
      if(number>0)
      {
       System.out.println("Number is positive");
      }
     else
      {
         System.out.println("Number is negative");
      }
      
      }
}

