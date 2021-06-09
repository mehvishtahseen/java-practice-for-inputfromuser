package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner takeInput  = new Scanner(System.in);
        System.out.print("What is your email: ");
        String email = takeInput.next();
        System.out.print("What is your height: ");
        float height = takeInput.nextFloat();
        System.out.println("Your email is: " + email);
        System.out.println("Your height is: " + height);
    }
}
