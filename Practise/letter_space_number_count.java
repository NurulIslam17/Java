/*
Write a Java program to count the letters, spaces, numbers and other characters of an input string.
 */
package Practise;

import java.util.Scanner;

public class letter_space_number_count {

    public static void main(String[] arg) {
        int letter = 0, space = 0, number = 0, other = 0;
        System.out.print("Enter the String : ");
        Scanner input = new Scanner(System.in);
        char[] str = input.nextLine().toCharArray();

        for (int i = 0; i < str.length; i++) {
            if (Character.isLetter(str[i])) {
                letter++;
            } else if (Character.isDigit(str[i])) {
                number++;
            } else if (Character.isSpaceChar(str[i])) {
                space++;
            } else {
                other++;
            }
        }
        System.out.println("Letter : " + letter);
        System.out.println("Number : " + number);
        System.out.println("Spaces : " + space);
        System.out.println("Others : " + other);
    }
}
