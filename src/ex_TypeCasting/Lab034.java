package ex_TypeCasting;

public class Lab034 {
    public static void main(String[] args){
        String password = "Snehal@123" ;
        String pass_u = password.toLowerCase();
        System.out.println(pass_u);

        System.out.println(pass_u == password); // false lower and upper case
        System.out.println(pass_u.equals(password)); // false
        System.out.println(pass_u.equalsIgnoreCase(password)); // true
        System.out.println(password.substring(0,3)); // tell about the range:- Sne
        System.out.println(password.indexOf('e'));// 2 staring from 0
        System.out.println(password.length()); // 10 starting from 1






    }
}
