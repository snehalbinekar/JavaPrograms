package ex_Conditions;

import java.util.Scanner;

public class Lab049 {
    public static void main(String[] args) {
        // Take a user input as char and Tell the user if it is a vowel
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a char I'll tell you if is a Vowel or not");
        char user_input = sc.next().charAt(0);

        switch (user_input) {
            case 'a':
                System.out.println("Vowel");
                break;
            case 'e':
                System.out.println("Vowel");
                break;
            case 'i':
                System.out.println("Vowel");
                break;
            case 'o':
                System.out.println("Vowel");
                break;
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Not Vowel");
                break;
        }

    }
}