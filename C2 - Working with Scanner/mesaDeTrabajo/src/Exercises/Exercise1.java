/*
Make a function that given a number indicates whether it is a prime number or not.
 Use this function in a program, which allows the entry of a number and then call the developed function
 to check if it is prime or not.
 */
package Exercises;

public class Exercise1 {
    public boolean isPrime(int n){
        int dividers = 1;
        for(int i = 2; i <= n; i++){
            if(n % i == 0){
                dividers++;
            }
        }
        return dividers == 2;
    }
}
