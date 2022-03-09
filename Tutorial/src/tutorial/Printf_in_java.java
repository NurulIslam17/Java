
package tutorial;
import java.util.Scanner;

public class Printf_in_java 
{
     public static void main(String[]arg)
    {
        int a,b,sum;
        System.out.print("Enter the number1 : ");
        Scanner input=new Scanner(System.in);
        a=input.nextInt();
        System.out.print("Enter the number2 : ");
        b=input.nextInt();
        sum=a+b;
  
        System.out.print("The addition of "+a+" and "+b+" is : "+sum);
        System.out.printf("\nThe addition of %d and %d is : %d ",a,b,sum);
    }
}
