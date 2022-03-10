/*
    bubble sort
 */
package Sort;
import java.util.Scanner;

public class bubble_sort 
{
    public static void main(String[]arg)
    {
        int []elements = new int[20];
        int limit,arr_len;
        Scanner input =  new Scanner(System.in);
        System.out.print("Enter the number of elements :");
        limit=input.nextInt();
        for(int i=0;i<limit;i++)
        {
            elements[i]=input.nextInt();
        }
        for(int i=0;i<limit;i++)
        {
//          System.out.print(" "+elemets[i]);
            int flag=0;
            for(int j=0;j<limit-1-i;j++)  // i avoid last elements to check
            {
                if(elements[j] > elements[j+1])
                {
                    int temp = elements[j];
                    elements[j]=elements[j+1];
                    elements[j+1]=temp;
                    flag=1;
                }
            }
            if(flag==0){
                break;
            }
        }
        System.out.println("Sroted Elements are -> "); 
        for(int i=0;i<limit;i++){
            System.out.print(" "+elements[i]);
        }
        System.out.println();
        
    }
    
}
