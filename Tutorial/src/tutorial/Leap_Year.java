
package tutorial;

import java.util.Scanner;

public class Leap_Year
{
    public static void main(String[]arg)
    {
        int year;
        System.out.print("Enter the year : ");
        Scanner input=new Scanner(System.in);
        year=input.nextInt();
        
        if(year%100==0)
        {
            if(year%400==0)
            {
                System.out.println(year+" is a Leap Year");
            }
            else
            {
                System.out.println(year+" is not a Leap Year");
            }
        }
        else
        {
           if(year%4==0)
           {
               System.out.println(year+" is a Leap Year");
           }
           else
           {
               System.out.println(year+" is not a Leap Year");
           }
        }
    }
}
