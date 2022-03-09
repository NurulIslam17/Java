
package tutorial;
import java.util.Scanner;


public class ClassCreate 
{
     public static void main(String[] args) 
    {
        int first,second,sum,sub,mult,div;
        
        System.out.print("Enter frist number : ");
        Scanner in= new Scanner(System.in);
        first=in.nextInt();
         System.out.print("Enter second number : ");
        second=in.nextInt();
        System.out.println();
        
        sum=first+second;
          sum=first+second; 
         System.out.println("Sum of the integers :  " +sum);
           sub=first-second;
         System.out.println("Sub of the integers :  " +sub);
           mult=first*second;
         System.out.println("Mult of the integers :  " +mult);
           div=first/second;
         System.out.println("Div of the integers :  " +div);
        
         
        
      
    }
}
