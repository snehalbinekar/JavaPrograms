package ex_Operators;

public class Lab020 {
    public static void main(String[] args){
        int a = 12;
        boolean b = !(a > 10 || a < 5); // BODMAS
        System.out.println(b);
    }
}
