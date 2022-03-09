
package tutorial;
import java.util.Scanner;

public class Linear_search 
{
    public static void main(String arg[])
    {
        int count,number,search;
        System.out.print("Enter the input numbers: ");
        Scanner input=new Scanner(System.in);
        number=input.nextInt();
        int  ar[]=new int[number];
        for( count=0;count<ar.length;count++)
         ar[count]=input.nextInt();
        System.out.print("Enter the search item : ");
        search=input.nextInt();
        
           for(count=0;count<ar.length;count++)
           {
               if(ar[count]==search)
               {
                   System.out.println(search+" is present at location["+(count+1+"]"));
                   break;
               }   
           }
           if(count==number) //when length is overed...............
           {
                 System.out.println(search+" doesn't exist in the array");
           }
            
       
    }
}
