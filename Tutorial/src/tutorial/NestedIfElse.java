package tutorial;
import java.util.Scanner;

public class NestedIfElse 
{
    public static void main(String[]arg)
    {
        int first,second,third;
        Scanner num=new Scanner(System.in);
        System.out.print("Enter the numbers : ");
        first=num.nextInt();
        second=num.nextInt();
        third=num.nextInt();
        
        if(first>=second)
        {
            if(first>=third)
            {
              System.out.println("Greatest number is : "+first);
            }
            else
            {
               System.out.println("Greatest number is : "+third);
            }
        }
       else
        {
             if(second>=third)
             {
                 System.out.println("Greates number is : "+second );
             }
              else
             {
                 System.out.println("Greates number is : "+third );
             }
        }
    }  
}
