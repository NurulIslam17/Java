package tutorial;
import java.util.Scanner;

public class Single_Element_Square_Sum 
{
    public static void main(String[]arg)
    {
        int number,rem,temp,sum=0;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number : ");
        number=input.nextInt();
        temp=number;
        while(number!=0)
        {   
            rem=number%10;
            sum=sum+rem*rem;
            number=number/10;
        }
        
        System.out.print("Element(Seperatly)square sum of "+temp);
        System.out.println(" is : "+sum);
    }  
}
