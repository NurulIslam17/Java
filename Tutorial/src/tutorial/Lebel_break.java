
package tutorial;
import java.util.Scanner;
public class Lebel_break 
{
   public static void main(String[]arg)
    {
        int a,b;
        System.out.print("Enter the row : ");
        Scanner input=new Scanner(System.in);
        a=input.nextInt();
        System.out.print("Enter the column : ");
        b=input.nextInt();
        label:
        for(int i=1;i<=a;i++)
        {
            for(int j=1;j<=b;j++)
            {
                if(i==5)
                    break label;
                System.out.print("* ");
            }
           System.out.println("");
         } 
     }
}
