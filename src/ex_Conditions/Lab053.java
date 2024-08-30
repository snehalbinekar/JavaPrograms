package ex_Conditions;

import java.util.Scanner;

public class Lab053 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String user_input = sc.next();

        System.out.println("Enter your age");
        int age = sc.nextInt();

        System.out.println("Enter your salary");
        double sal =sc. nextDouble();

        System.out.println("My name is "+ " "+user_input);
        System.out.println("My age is "+ " "+age);
        System.out.println("My salary is "+ " "+sal);
    }
}
