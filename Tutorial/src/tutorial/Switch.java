
package tutorial;

import java.util.Scanner;

public class Switch
{
    public static void main(String[]arg)
    {
        int a;
        System.out.print("Enter the number : ");
        Scanner input=new Scanner(System.in);
        a=input.nextInt();
       switch (a)
          {
           case 1:
               System.out.println("Entered number is ONE");
               break;
           case 2:
               System.out.println("Entered number is TWQ");
               break;
           case 3:
               System.out.println("Entered number is THREE");
               break;
           case 4:
               System.out.println("Entered number is FOUR");
               break;
           case 5:
               System.out.println("Entered number is FIVE");
               break;
           default:
               System.out.println("ANY NUMBER");
  
    }
    
    }
}