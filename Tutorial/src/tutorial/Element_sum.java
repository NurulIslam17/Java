package tutorial;
import java.util.Scanner;

public class Element_sum 
{
    public static void main(String[]arg)
    {
        int number,sum=0,seperateElement;
        System.out.print("Enter the number : ");
        Scanner input=new Scanner(System.in);
        number=input.nextInt();
        while(number!=0)
        {
            seperateElement=number%10;
            sum=sum+seperateElement;
            number=number/10;  
        }   
        System.out.println("Sum of all seperate number : "+sum);
    }
}
