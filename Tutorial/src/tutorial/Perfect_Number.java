package tutorial;
import java.util.Scanner;

public class Perfect_Number 
{ // 6, 28, ..............................
    public static void main(String[]arg)
    {
        int number,rev,sum=0;
        System.out.print("Enter the number : ");
        Scanner input=new Scanner(System.in);
        number=input.nextInt();
        
       for(int i=1;i<=number/2;i++)
       {
           if(number%i==0)
           {
                 sum=sum+i;
           }
       }
       if(number==sum)
           System.out.println(number+" is perfect number");
       else
           System.out.println(number+" is not a perfect number");
    }
}
