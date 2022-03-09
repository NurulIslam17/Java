package tutorial;

import java.util.Random;

public class Array_random 
{
     public static void main(String[]arg)
    {
        Random r=new Random();
        int a[]=new int[10];// displayes 10 random values
        for(int i=0;i<a.length;i++)
        {
            a[i]=r.nextInt(5);// values are within 0 to 4
        }
         System.out.println(" Random values are : ");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(" "+a[i]);
        }
     
    }
}
