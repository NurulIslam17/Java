/*
    Linear Search
 */
package Search;
import java.util.Scanner;
public class linear
{
    public static void main(String[]arg)
    {
        Scanner input = new Scanner(System.in);
        int []a = new int[20];
        int limit,search_item,not_found=0;
        System.out.print("Enter the number of element : ");
        limit=input.nextInt();
        System.out.println("Enter the elements > ");
        for(int i=0 ;i<limit ; i++)
        {
            a[i] = input.nextInt();
            System.out.println("Index["+i+"] : "+a[i]);
        }
        
        System.out.print("\nEnter the search of element > ");
        search_item = input.nextInt();
        for(int i=0 ;i<limit ; i++)
        {
            if(a[i]==search_item)
            {
                System.out.println(search_item+" is found at index["+i+"]");
                not_found=1;
                break;
            }
        }
        if(not_found==0)
        {
            System.out.println(search_item+" is not in List");
        }
        
    }
}
