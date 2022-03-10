/*
 Binary search
List/ array shoud be in sorted order
 */
package Search;


public class binary
{
    public static void main(String[]arg)
    {
        int search,Li,Hi,Mi;
        int []array = {23,34,56,67,87,98};
        Li=0;
        Hi=array.length-1;
        search=67;

        Mi=(Li+Hi)/2;

        int flag=0;
        while(Li<=Hi)
        {
            if(array[Mi]==search)
            {
                System.out.println(search+" is found at index["+Mi+"].");
                flag=1;
                break;
            }
            else if(array[Mi] < search)
            {
                Li = Mi+1;
            }
            else
            {
                Hi = Mi-1;
            }
            Mi=(Li+Hi)/2;
        }
        if(flag==0)
        {
            System.out.println(search+" is not found");
        }
    }
}
