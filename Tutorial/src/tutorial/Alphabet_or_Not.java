package tutorial;
import java.util.Scanner;

public class Alphabet_or_Not
{
    public static void main(String[]arg)
    {
        char character;
        System.out.print("Enter the character : ");
        Scanner ch=new Scanner(System.in);
       character=ch.next().charAt(0);
       
       if(character>='a'&& character<='z'||character>='A'&&character<='Z')
       {
           System.out.println(character+" is Alphabet");
       }
       else
       {
           System.out.println(character+" is not Alphabet");
       }
    }
}
