
package tutorial;

import java.util.Scanner;

public class Multiplication_Table
{
    public static void main(String arg[])
    {
        int number,i,mulT;
        System.out.print("Enter the number : ");
        Scanner input= new Scanner(System.in);
        number= input.nextInt();
           System.out.println("Multiplication table for "+number+" is - \n-----------------------------------");
        for(i=1;i<=10;i++)
        {
            mulT=number*i;
            System.out.println(+number+"X"+i+"="+mulT);
            
        }
        System.out.println("-----------------------------------");
    }
}
