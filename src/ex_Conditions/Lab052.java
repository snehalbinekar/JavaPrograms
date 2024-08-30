package ex_Conditions;

public class Lab052 {
    public static void main(String[] args){
        // JDK>13
        char code = 'B';
        int val = switch (code) {
            case 'A':
                yield 65;//it is a return type in switch
            case 'B':
                yield 66;
            default:
                throw new IllegalStateException("Unexpected Value: " + code);
        };
        System.out.println(val);
        }

    }

