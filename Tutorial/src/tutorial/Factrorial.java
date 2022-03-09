
package tutorial;
import java.util.Scanner;

public class Factrorial 
{
    public static void main(String[]arg)
    {
        int number,factorial=1,i=1;
        System.out.print("Enter the number : ");
        Scanner input=new Scanner(System.in);
        number=input.nextInt();
        
        while(i<=number)
        {
            factorial=factorial*i;
            i++;
        }
        System.out.print("Factorial of "+number);
        System.out.println(" is = "+factorial);
    }
}
