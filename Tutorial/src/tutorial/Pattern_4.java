package tutorial;

import java.util.Scanner;

public class Pattern_4 
{
        public static void main(String[]arg)
    {
        int row,colomn;
        System.out.print("Enter the row: ");
        Scanner input=new Scanner(System.in);
        row=input.nextInt();
        
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=i;j++)
               {
                   if ((i+j)%2==0)
                   System.out.print("1 ");
                   else
                       System.out.print("0 ");
               }
             System.out.println(" ");
        }
        }   
  }

