package ex_Arrays;

import java.util.Scanner;

public class Lab090 {
    public static void main(String[] args){
        //Where we take the user input of the 5 subjects - Avg of the subject.
        //        // Figure inputs - float, scanner class
        Scanner sc = new Scanner(System.in);
        float [] marks = new float[5];
        for(int i=0; i< marks.length; i++){
            System.out.println("Enter the marks of the Subject" + (i+1));

           marks[i]= sc.nextFloat();

           System.out.println("Marks of sub"  +  (i+1)+ ":" + marks[i]);

           float avg= (marks[0]+marks[1]+marks[2]+marks[3]+marks[4])/5;
           System.out.println("Avg is " + "-->"+avg );
           int j=0;
           while(j>marks.length){
               System.out.println(marks[j]);
               j++;

           }






        }

    }
}
