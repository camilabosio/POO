package Exercises;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------EXERCISE 1--------");
        //Exercise 1
        Exercise1 exercise1 = new Exercise1();
        if(exercise1.isPrime(3)){
            System.out.println(3 + " is prime");
        }
        else{
            System.out.println(3 + "Is´nt prime");
        }

        System.out.println("-------EXERCISE 2--------");
        //Exercise 2
        Exercise2 exercise2 = new Exercise2();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number A");
        Integer numberA = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please enter a number B");
        Integer numberB = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please enter a number C");
        Integer numberC = scanner.nextInt();
        scanner.nextLine();

        exercise2.maximumBetweenTheThreeNumbers(numberA, numberB, numberC);

        System.out.println("-------EXERCISE 3--------");

        //Exercise 3
        Exercise3 exercise3 = new Exercise3();
        if(exercise3.differentTextStrings("Hi","Bye")){
            System.out.println("They are different strings");
        } else {
            System.out.println("They are the same strings");
        }
    }
}