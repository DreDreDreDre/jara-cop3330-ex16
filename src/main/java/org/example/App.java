package org.example;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Andre Jara
 */

public class App 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String input;
        int age;
        String output;

        System.out.print("What is your age? ");
        input = sc.nextLine();
        age = Integer.parseInt(input);

        output = (age >= 16) ? "You are old enough to legally drive." : "You are not old enough to legally drive.";

        System.out.println(output);

        sc.close();
    }
}
