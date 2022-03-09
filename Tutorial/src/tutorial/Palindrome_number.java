package tutorial;
import java.util.Scanner;

public class Palindrome_number 
{
    public static void main(String[]arg)
    {
        int n,number,reverse,sum=0;
        System.out.print("Enter the number : ");
        Scanner input=new Scanner(System.in);
        number=input.nextInt();
        n=number;
        while(number!=0)
        {
            reverse=number%10;
            sum=sum*10+reverse;
            number=number/10;
        }
        if(n==sum)
        {
            System.out.println(n+" is a plaindrome number");
        }
        else
        {
            System.out.println(n+" is not a palindrome number");
        }
    }
}
