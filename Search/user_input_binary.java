package Search;
import java.util.Scanner;
public class user_input_binary 
{
    public static void main(String[] arg) 
    {
        Scanner input = new Scanner(System.in);
        int limit, search, Li, Hi, Mi;
        System.out.print("Enter the number of elemnts : ");
        limit = input.nextInt();
        int[] array = new int[limit];

        for (int i = 0; i < limit; i++) 
        {
            array[i] = input.nextInt();
            System.out.println("Index[" + i + "] : " + array[i]);
        }
        
        Li = 0;
        Hi = array.length - 1;
        Mi = (Li + Hi) / 2;
        
        System.out.print("Enter Searching Elements : ");
        search = input.nextInt();
        
        int flag = 0;
        while (Li <= Hi) {
            if (array[Mi] == search) 
            {
                System.out.println(search + " is found at index[" + Mi + "].");
                flag = 1;
                break;
            } 
            else if (array[Mi] < search) 
            {
                Li = Mi+1;
            } 
            else 
            {
                Hi = Mi-1;
            }
            Mi = (Li + Hi) / 2;
        }
        if (flag == 0) 
        {
            System.out.println(search + " is not found");
        }
    }
}
