package tutorial;
import java.util.Scanner;

public class Cube_Sereise
{
    public static void main(String[]arg)
    {
        int range,sum=0;
        System.out.print("Enter the sereise range : ");
        Scanner input=new Scanner(System.in);
        range=input.nextInt(); 
        for(int i=1;i<=range;i++)
        {
            sum=sum+i*i*i;
        }
        System.out.println("Cube sum of entred range :"+sum);
       
    }
}
