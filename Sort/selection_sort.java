/*
 Selection Sort
 */
package Sort;
import java.util.Scanner;
public class selection_sort {

    public static void main(String[] arg) 
    {
        int[] a = new int[20];
        int limit,temp;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number of elemets : ");
        limit = input.nextInt();
            // Taking Array input
        for (int i = 0; i < limit; i++)
        {
            a[i] = input.nextInt();
        }
        // selection Sorting algo
        for (int i = 0; i < limit; i++) 
        {
            //System.out.print(" "+a[i]);
            int min=i;
            for (int j = i + 1; j < limit; j++) 
            {
                if(a[j]<a[min])
                {
                    min=j;
                }
            }
            temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }
        for (int i = 0; i < limit; i++) 
        {
            System.out.print(" "+a[i]);
        }
        System.out.println();
    }
}
