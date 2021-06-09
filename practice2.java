package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner takeInput  = new Scanner(System.in);
        System.out.print("Type your name with white spaces: ");
        //if we put .next() instead of .nextLine() it will only take the first input and
        // leave every thing after space
        //sometimes it is possible for user to add extra spaces before the name
        // .trim() operator will fix the problem
        String fullNameTrim = takeInput.nextLine().trim();
        System.out.print("What is your email: ");
        String email = takeInput.next().trim();
        System.out.print("What is your height: ");
        float height = takeInput.nextFloat();
        // after taking the data from the user given information will be printed by these statements
        System.out.println("your full name without any extra spaces is: " + fullNameTrim);
        System.out.println("Your email is: " + email);
        System.out.println("Your height is: " + height);
        System.out.printf("Your height is rounded up here: %.2f", height);


    }
}
