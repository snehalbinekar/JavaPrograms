package ex_Conditions;
import java.util.Scanner;


public class Lab043 {
    public static void main(String[] args){
        // Take user input and check if number id even or odd.



        // Logic Building - Ready
        // 1. Figure out the inputs &  // 2. Data type
        //  Data type  - . int
        // How to take input in the Java? - Scanner - class -
        // nextInt() -> input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num");
        int user_input = sc.nextInt();
         System.out.println(user_input);

         if(user_input%2==0) {
             System.out.println("Even");
         }
         else {
             System.out.println("odd");

         }

    }
}
