package tutorial;
import java.util.Scanner;

public class Prime_Number 
{
    public static void main(String[]ar)
    {
       int number,flag=0;
       System.out.print("Enter the number : ");
       Scanner input=new Scanner(System.in);
       number=input.nextInt();
       for(int i=2;i<number;i++)
       {
           if(number%i==0)
           {
               flag=1;
               break;
           } 
       }
       if(number==1)
           System.out.println("1 is neither Prime nor a Composite ");
       else
       {
           if(flag==0)
               System.out.println(number+" is a Prime number");
           else
               System.out.println(number+" is Not a Prime number");
       }
    }
}
