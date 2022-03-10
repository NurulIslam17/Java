/*
  Write a Java program to print the area and perimeter of a circle

 */
package Practise;

import java.util.Scanner;

public class area_pereMtr_circle 
{
    public static void main(String[]arg){
        double redius;
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the rediis of the circle : ");
        redius = inp.nextDouble();
        
        double pere = 2*Math.PI *redius;
        double area = Math.PI*Math.pow(redius,2);
        
        System.out.println("Area is "+area+"\nPerimeter is : "+pere);
    }
    
}
