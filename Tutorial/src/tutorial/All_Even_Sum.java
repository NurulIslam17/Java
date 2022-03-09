
package tutorial;
import java.util.Scanner;


public class All_Even_Sum 
{
    public static void main(String[]arg)
    {
        int range,sum=0;
        System.out.print("Enter the number : ");
        Scanner input=new Scanner(System.in);
        range=input.nextInt();
        
        for(int i=0;i<=range;i++)
        {
            sum=sum+i;
            i++;
        }
        System.out.print("Sumation of all number 1 to "+range);
         System.out.println("is : "+sum);
    }
}
