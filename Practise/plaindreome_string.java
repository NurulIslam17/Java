/*
 palindrome string Check
 */
package Practise;
import java.util.Scanner;
public class plaindreome_string 
{
    public static void main(String[]arg){
        int rev[]= new int[100];
        int c=0;
        System.out.print("Enter the String : ");
        Scanner str = new Scanner(System.in);
        char [] letters = str.nextLine().toCharArray();
        System.out.print("Reversed String ");
        
        for(int i=letters.length-1;i>=0;i--){
            rev[c++]=letters[i];
        }
        System.out.println(rev[c]);
    }
}
