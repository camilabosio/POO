/*
Write a function that receives three numbers and returns the maximum between the three numbers.
Integer maximBetweenThreesNumbers(Integer numberA, Integer numberB,
Integer numberC) Then make a program that allows the entry of 3 values, use the function and show the result.
 */
package Exercises;

public class Exercise2 {
    public Integer maximumBetweenTheThreeNumbers(Integer numberA, Integer numberB, Integer numberC){
        Integer maximum = numberA;
        if(maximum < numberB){
            maximum = numberB;
        }
        if(maximum < numberC){
            maximum = numberC;
        }
        System.out.println("The maximum of " + numberA + ", " + numberB + " and " + numberC + " is " + maximum);
        return maximum;
    }
}
