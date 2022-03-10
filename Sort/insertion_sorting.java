/* 
    insertion Sort
*/
package Sort;
import java.util.Scanner;
public class insertion_sorting 
{
    public static void main(String[]arg)
    {
        Scanner in = new Scanner(System.in);
        int[]a=new int[20];
        int limit,temp;
        System.out.print("Enter the number of elements : ");
        limit=in.nextInt();
        
        for(int i=0; i<limit; i++)
        {
            a[i] = in.nextInt();
        }
        // Insertion sort Alog
        for(int i=1; i<limit; i++)
        {
            temp = a[i];
            int j=i;
            while(j>0 && temp < a[j-1])
            {
                a[j] = a[j-1];
                j--;
            }
            a[j]=temp;
        }
        System.out.print("Sorted elements are : \n");
        for(int i=0;i<limit;i++)
        {
            System.out.print(" "+a[i]);
        }
        System.out.println();
    }
    
}
