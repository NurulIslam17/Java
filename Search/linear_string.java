/*
 linear string search
 */
package Search;
public class linear_string 
{
    
    public static void main(String[]arg)
    {
    
        String []a = {"Nurul","Abrar","Xovan"};
        String search_item;
        int not_found=0;
        //System.out.print("Enter the number of element : ");
     
        search_item ="eNurul";
        for(int i=0 ;i<a.length ; i++)
        {
            if(a[i].equals(search_item))
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
