package tutorial;
import java.util.Scanner;

public class Armstrong_Numeber 
{
    public static void main(String[]arg)
    {  // 153...................
        int number,rev,sum=0;
        System.out.print("Enter the number : ");
        Scanner input=new Scanner(System.in);
        number=input.nextInt();
        int temp=number;
        
        while(number!=0)
        {
            rev=number%10;
            sum=sum+rev*rev*rev;
            number=number/10;
        }
       if(temp==sum)
           System.out.println(temp+" is an armstrong number");
       else
           System.out.println(temp+" is not an armstrong number");
    }
}
