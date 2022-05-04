package org.launchcode.java.demos.technology;

import java.util.Scanner;

public class Computer {
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("What does 2 + 2 equal: ");
        int questionOne = input.nextInt();


        if(!(questionOne == 4)) {
            System.out.println("Incorrect!");
        } else {
            System.out.println("Correct!");
        }

    }
}
