/*
    Write a Java program to create and display unique three-digit number using 1, 2, 3, 4. 
    Also count how many three-digit numbers are there
 */
package Practise;

public class unique_three_digit_number {

    public static void main(String[] arg) {
        int amount = 0;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                for (int k = 1; k <= 4; k++) {
                    if (k != i && k != j && i != j) {
                        System.out.println(i + "" + j + "" + k);
                        amount++;
                    }
                }
            }
        }
        System.out.println("Total Unique Number is : " + amount);
    }
}
