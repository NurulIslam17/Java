/*
 Write a Java program to convert a decimal number to binary number.
 */
package Practise;

import java.util.Scanner;

public class decimal_to_binary{
    public static void main(String[]arg){
        int dec_num,qout,i=1,j;
        int bin_num[]= new int[100];
        
        System.out.print("Enter Decimal Number : ");
        Scanner in = new Scanner(System.in);
        dec_num=in.nextInt();
        
        qout = dec_num;
        
        while(qout!=0){
            bin_num[i++]=qout%2;
            qout = qout/2;
        }
        System.out.print("Binary number is: ");
        for( j=i-1;j>0;j--){
            System.out.print(bin_num[j]);
        }
        System.out.print("\n");
        
        
    }
    
}
