package tutorial;
import java.util.Scanner;

public class Fibonacci_series 
{
    public static void main(String[]arg)
    {
      int number,a=0,b=1,sum=0;
      System.out.print("Enter a number : ");
      Scanner input=new Scanner(System.in);
      number=input.nextInt();
      System.out.print("Fibonacci series is : : ");
      System.out.print("0 1");
   
      for(int i=1;i<=number;i++)
      {
          sum=a+b;
          System.out.print(" "+sum);
          a=b;
          b=sum;
      }
        System.out.println("Fibonacci series is Displayed ");
    }
}
