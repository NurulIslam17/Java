package tutorial;
import java.util.Scanner;

public class Pattern_3 
{
    public static void main(String[]arg)
    {
        int row,colomn;
        System.out.print("Enter the row: ");
        Scanner input=new Scanner(System.in);
        row=input.nextInt();
        System.out.print("Enter the row: ");
        colomn=input.nextInt();
        
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=colomn;j++)
            {
               if(i==1 || i==row || j==1 || j==colomn)
               {
                   System.out.print("*");
               }
               else
               {
                   System.out.print(" ");
               }
            }
             System.out.println(" ");
        }   
    }
}
