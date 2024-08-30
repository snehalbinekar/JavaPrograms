package ex_Arrays;

public class Lab093 {
    public static void main(String[] args){
        int[][] array_2d = {
                {34, 12, 11},
                {34, 12, 34},
                {11, 23, 98}
        };
        //Row:- 3-i-> 0 to 2
        // Coloumn :- 3 j-> 0 to 2
        for (int i = 0; i < array_2d.length; i++) {        // i=0 j -> 0, 1,2
            for (int j = 0; j < array_2d[i].length; j++) {  // i=1 j-> 0,1,2
                System.out.print(array_2d[i][j]);          // i=2  j-> 0,1,2
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
