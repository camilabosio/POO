package com.company;
//Use a function to resolve that given two values separately then return them in a single variable

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Exercise 1
        String name, surname;
        String initials;
        System.out.println("Please enter your name");
        name = scanner.nextLine(); //Next line permite la entrada de datos
        System.out.println("Please enter your Surname");
        surname = scanner.next();
        initials = "Your initials are " + name.charAt(0) + surname.charAt(0);
        System.out.println(initials);

        //Exercise 2
        int day, month, year;
        String date;
        System.out.println("Please enter your day of birth");
        day = scanner.nextInt();
        System.out.println("Please enter your month of birth");
        month = scanner.nextInt();
        System.out.println("Please enter your year of birth");
        year = scanner.nextInt();
        date = day + "/" + month + "/" + year;
        System.out.println("Your date of birth is " + date);



    }
}