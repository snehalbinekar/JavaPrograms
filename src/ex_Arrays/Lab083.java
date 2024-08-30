package ex_Arrays;

import java.util.Scanner;

public class Lab083 {
    public static void main(String[] args){
        //Array-new
        int[] marks = new int[3];
        //element:-0,1,2  lenght:-3
        System.out.println(marks[0]);  /*all three will give 0 becoz we have not given,any
        System.out.println(marks[1]);     so memory automatically store 0 in it*/
        System.out.println(marks[2]);
        Scanner sc=new Scanner(System.in);
        marks[0]=sc.nextInt();
        marks[1]=90;
        marks[2]=98;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        boolean [] is_married= {true,false,true};
        //to print
        for(int i= 0; i<marks.length;i++){
            // i=0,1,2
            System.out.println(i +"->"+marks[i]);


        }



    }
}
