/*
Write a Java program that takes a number as input and prints its multiplication table upto 10
 */
package Practise;

import java.util.Scanner;

public class multiplication {
    public static void main(String[]arg){
        int number;
        System.out.print("Enter the number : ");
        Scanner input = new Scanner(System.in);
        number=input.nextInt();
        
        for (int i=1;i<=10;i++){
            System.out.println(number+"  X "+i+" = "+(number*i));
        }
    }
    
}
