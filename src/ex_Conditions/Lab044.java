package ex_Conditions;
import java.util.Scanner;

public class Lab044 {
    public static void main(String[] args){
        // Max numner from user input

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1");
        int num1 = sc.nextInt();
        System.out.println("Enter the num2");
        int num2 = sc. nextInt();
        // System.out.println(Math.max(num1,num2));
         if(num1>num2){
             System.out.println(num1);
         }
         else if (num2>num1){
             System.out.println(num2);
         }
         else{
             System.out.println("equal");
         }

    }
}
