/*
 Write a Java program to reverse a string.
 */
package Practise;
import java.util.Scanner;
public class reverse_string 
{
    public static void main(String[]arg){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String : ");
        char[] letter = input.nextLine().toCharArray();
        System.out.print("Reverse string is : ");
       
        for(int i=letter.length-1;i>=0;i--){
            System.out.print(letter[i]);
        } 
        System.out.print("\n");
    } 
}
