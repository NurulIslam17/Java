package tutorial;
import java.util.Scanner;

public class Array_userInput 
{
       public static void main(String[]arg)
    {
        int number;
        System.out.print(" Enter the number : ");
        Scanner inp=new Scanner(System.in);
        number=inp.nextInt();
       
        int a[]=new int[number];
        System.out.println(" Enter the element in array : ");
        for(int i=0;i<number;i++)
        {
            a[i]=inp.nextInt();
        }
        
         System.out.println(" Array elements are :  : ");
        for(int i:a)
        {
            System.out.println(" "+i);
        }
     
    }
}
