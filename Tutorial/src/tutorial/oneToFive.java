
package tutorial;
import java.util.Scanner;

public class oneToFive 
{
     public static void main(String[] args) 
    {
        int n;
        System.out.print("Enter the number : ");
        Scanner in= new Scanner(System.in);
        n=in.nextInt();
        
        System.out.println("Display all number from  to "+n);
        for(int i=1;i<=n;i++)
        {
        System.out.println( i);
         /* System.out.println("Nurul Islam");*/
        
        }          
    }
}
