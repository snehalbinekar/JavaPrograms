package ex_Conditions;

public class Lab050 {
    public static void main(String[] args){
        // if JDK>13 then switch case we can apply like this also

        int itemcode= 006;
        switch(itemcode){
            case 001,002,003:
                System.out.println("It is an Electronic Gadget!");
                break;
            case 004, 005, 006:
                System.out.println("It is a Mechanical Gadget!");
                break;
            default:
                System.out.println("None");

        }
    }
}
