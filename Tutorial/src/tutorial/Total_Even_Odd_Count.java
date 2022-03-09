package tutorial;

import java.util.Scanner;
public class Total_Even_Odd_Count
{
  public static void main(String[]arg)
  {
      int number,even=0,Odd=0;
      System.out.print("Enter the number : ");
      Scanner input=new Scanner(System.in);
      number=input.nextInt();
      
      for(int i=1;i<=number;i++)
      {
          if(i%2==0)
          {
              even= even+1;
              System.out.print("  "+i);
          }
          else
          {
           Odd=Odd+1;
            //System.out.print(" "+i);
          }
      }
      System.out.print("\nTotal even number of 1 to "+number);
      System.out.println(" is: "+even);
      System.out.print("Total odd number of 1 to "+number);
      System.out.println(" is: "+Odd);  
  }
}
