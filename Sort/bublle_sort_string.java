/*
bubble sort for string
 */
package Sort;
public class bublle_sort_string 
{
    public static void main(String[]arg)
    {
        String []elements = {"Babu","Nurul","Abrar","Suyaiba","Jovan","Afik","Anirban"};

        for(int i=0;i<elements.length;i++)
        {
            int flag=0;
            for(int j=0;j<elements.length-1-i;j++)  // i avoid last elements to check
            {
                if(elements[j].compareTo(elements[j+1]) > 0)
                {
                    String temp = elements[j];
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
        for (String element : elements) {
            System.out.print(" > " + element);
        }
        System.out.println();  
    } 
}
