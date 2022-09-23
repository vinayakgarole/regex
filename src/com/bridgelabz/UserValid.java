package com.bridgelabz;
import java.util.Scanner;
import java.util.regex.Pattern;
public class UserValid {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
        // Method To Check First Name With Regex Start With Cap And 3 Min. Character
        System.out.println("Enter the first Name: ");
        String firstName = scan.nextLine();

        if (Pattern.matches("^[A-Z][a-z]{2,}", firstName)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
