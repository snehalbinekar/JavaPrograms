package ex_Arrays;

public class Lab095 {
    public static void main(String[] args) {
        // Strings - imutable in nature
        // StringBuilder , StringBuffer
        String s1 = "Snehal";
        s1 = "Binekar";

        StringBuffer stringBuffer = new StringBuffer("Snehal");
        // change the value of string - Buffer
        stringBuffer.append("Binekar"); //SnehalBinekar
        stringBuffer.append("JI"); //SnehalBinekar

        StringBuilder stringBuilder = new StringBuilder("Sonal");
        stringBuilder.append("Sharma");

    }
}

