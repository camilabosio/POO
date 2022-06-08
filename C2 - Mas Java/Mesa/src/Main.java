//Exercise 1
//Write a function that should take two strings of text
//and return true, in case they are different, or false, if they match.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String textA, textB;

        System.out.println("Enter a text: ");
        textA = scanner.nextLine();

        System.out.println("Enter another text ");
        textB = scanner.nextLine();

        System.out.println("The result is: ");
        System.out.println(stringOfDifferentTexts(textA, textB));
    }
    public static boolean stringOfDifferentTexts (String textA, String textB) {

        if (textA != textB) {
            return true;
        } else {
            return false;
        }
    }
}
