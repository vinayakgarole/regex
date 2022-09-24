package com.bridgelabz;
import java.util.Scanner;
import java.util.regex.Pattern;
public class UserValid {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // Method To Check First Name With Regex Start With Cap And 3 Min. Character
        System.out.println("Enter the first Name: ");
        String firstName = scan.nextLine();
        System.out.println("Enter the last Name: ");
        String lastName = scan.nextLine();
        System.out.println("Enter The Mail: ");
        String mail = scan.nextLine();
        System.out.println("Enter The Mobile Number With County Code: ");
        String mobileNumber = scan.nextLine();
        System.out.println("Enter the valid password: ");
        String password = scan.nextLine();
        System.out.println("Enter the password at least one upper case: ");
        String password1 = scan.nextLine();
        System.out.println("Enter the at least one numeric Number: ");
        String password2 = scan.nextLine();
        System.out.println("Enter the Special character password: ");
        String password3 = scan.nextLine();


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

        // Method to check Valid Mail with Regex
        if (Pattern.matches("^[a-zA-Z0-9]+[@][a-zA-Z]{3,15}[.][a-zA-Z]{2,5}", mail)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        // Method to check valid Mobile with Regex
        if (Pattern.matches("^91{1}\\s[0-9]{10}", mobileNumber)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        // Check 8 character password
        if (Pattern.matches("^[A-Za-z1-9]{8}", password)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        // Password at least one upper case
        if (Pattern.matches("^[A-Z][a-z]{7}", password1)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        // Numeric number in password
        if (Pattern.matches("^[A-Z][a-z0-9]{7}", password2)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        // Special Character Password
        if (Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$", password3)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}