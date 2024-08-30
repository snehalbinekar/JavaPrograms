package ex_Conditions;

import java.util.Scanner;

public class Lab055 {
    public static void main(String[] args){
        // Program to Check
        // if a Number is Positive
        // , Negative,
        // or Zero.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.");
        int user_input= sc.nextInt();
        if(user_input>0) {
            System.out.println("No. Is positive");
        }
        else if(user_input<0) {
            System.out.println("No. is negative");
        }

        }
    }

