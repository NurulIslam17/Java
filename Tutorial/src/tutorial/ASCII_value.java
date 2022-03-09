
package tutorial;

public class ASCII_value
{
    public static void main(String[]arg)
    {
        // 7 bits
        //2^7=128
        // range 0 to 127
        //
        System.out.println("All ASCII values are : ");
        for(int i=0;i<=127;i++)
        {
            System.out.printf("%d = %c \n",i,i);
        }
    }
}
