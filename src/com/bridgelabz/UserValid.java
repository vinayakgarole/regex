package com.bridgelabz;
import java.util.Scanner;
import java.util.Scanner;
import java.util.regex.Pattern;
public class UserValid {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // Method To Check First Name With Regex Start With Cap And 3 Min. Character
        System.out.println("Enter the first Name: ");
        String firstName = scan.nextLine();
        System.out.println("Enter the last Name :");
        String lastName = scan.nextLine();

        if (Pattern.matches("^[A-Z][a-z]{2,}", firstName)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        // Method To Check Last Name With Regex Start With Cap And 3 Min. Character
        if (Pattern.matches("^[A-Z][a-z]{2,}", lastName)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
