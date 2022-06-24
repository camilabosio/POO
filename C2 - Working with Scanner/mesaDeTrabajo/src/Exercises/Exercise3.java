/*
Write a function: boolean differentTextStrings (String textA, String textB) which must
take two strings of text and return true, in case they are different, or false, in case they match.
 */

package Exercises;
public class Exercise3 {
    public boolean differentTextStrings(String textA, String textB) {
        return !textA.equals(textB);
    }
}
