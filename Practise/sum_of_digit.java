/*
  Write a Java program and compute the sum of the digits of an integer.
*/
package Practise;
import java.util.Scanner;
public class sum_of_digit 
{
    public static void main(String[]arg){
        int number,sum=0,i=0;
        System.out.print("Enter the number : ");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        int temp=number;
        while(number!=0){
            sum=sum+(number%10);
            number/=10;
            i++;
        }
        System.out.println("Sum of all digit for "+temp+" is :"+sum);
    }
}
