package ex_Conditions;

import java.util.Scanner;

public class Lab056_LargestNo {
    public static void main(String[] args){
        // find the largest number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1");
        int num1 = sc.nextInt();

        System.out.println("Enter the num2");
        int num2= sc.nextInt();

        System.out.println("Enter the num3");
        int num3= sc.nextInt();

        if(num1>=num2 && num1>=num3) {
            System.out.println("Num1  ");
        }
        else if (num2>=num1 && num2>=num3){
            System.out.println("Num2 ");
        }
        else {
            System.out.println("Num3 ");


        }
    }
}
