package tutorial;
import java.util.Scanner;

public class Array_element_sum 
{
    public static void main(String arg[])
    {
        int number,sum=0;
        System.out.print("Enter the element number : ");
        Scanner input=new Scanner(System.in);
        number=input.nextInt();
        System.out.println("Enter the element : ");
        int a[]=new int[number];
        for(int i=0;i<a.length;i++)
        {
            a[i]=input.nextInt();
            sum=sum+a[i];
        }
        System.out.println("Element sum of the array is : "+sum);
    }
}
