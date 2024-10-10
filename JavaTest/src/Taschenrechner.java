import java.util.Scanner;
import java.lang.Math;

public class Taschenrechner {
    public static void main(String[] args) {

        System.out.println("Enter first Number:");
        String sNumber1 = new Scanner(System.in).nextLine();
        int number1 = Integer.valueOf(sNumber1);

        System.out.println("Enter second Number:");
        int number2 = Integer.valueOf(new Scanner(System.in).nextLine());


        System.out.println("Enter operand (+, -, *, /, ^)");
        String Operator = new Scanner(System.in).nextLine();

        int solution = 0;

        /*
        if (Operator.equals("+")) solution = number1 + number2; else
        if (Operator.equals("-")) solution = number1 - number2; else
        if (Operator.equals("*")) solution = number1 * number2; else
        if (Operator.equals("/")) solution = number1 / number2; else {
            System.out.println("Wrong Operand!");
            return;
        }
        */

        // if (solution == 0) System.out.println(("wrong Operand!");


        switch (Operator) { // Switch ist eine Alternative zu Zeilen 19 - 26)
            case "+" : solution = number1 + number2; break;
            case "-" : solution = number1 - number2; break;
            case "*" : solution = number1 * number2; break;
            case "/" : solution = number1 / number2; break;
            // case "^" : solution = Math.pow(number1, number2); break; // Math.pow gibt double aus, kein int

            case "^" : solution = (int) Math.round(Math.pow(number1, number2)); break; // Typecasting von double zu int

            default: System.out.println("Wrong Operand"); return;
        }

        int a = 5;
        int b = 2;

        boolean isBigger = a >= b;
        boolean isLess = a < b;

        if (isBigger) System.out.println("BIGGER");
        if (isLess) System.out.println("LESS");



        System.out.println("is" + " " + Integer.toString(solution));

    }
}
