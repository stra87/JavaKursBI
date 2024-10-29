import java.util.Scanner;

public class HA_Schleifen_10 {

    public static boolean isDigit(char ch) {
        switch (ch) {
            case '0':
                return true;
            case '1':
                return true;
            case '2':
                return true;
            case '3':
                return true;
            case '4':
                return true;
            case '5':
                return true;
            case '6':
                return true;
            case '7':
                return true;
            case '8':
                return true;
            case '9':
                return true;
            default:
                return false;
        }
    }

    public static boolean isNumber(String str) {

        for (int i = 0; i < str.length(); i++) {
//            System.out.println(str.charAt(i));
            if (!isDigit(str.charAt(i)))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

//        isNumber("1234");
//        return;

        int streichholz = 13;

        while (true) {


            System.out.println("Es gibt " + streichholz + " Streichhölzer. Wie viele Streichhölzer willst du ziehen? (1,2,3):");
            String eingabe = new Scanner(System.in).nextLine();

            if (!isNumber(eingabe)) {
                System.out.println("Du sollst zahlen eingeben!");
                continue;
            }

            int ziehen = Integer.parseInt(eingabe);

            if ((ziehen > 3) || (ziehen < 1)) {
                System.out.println("Hier wird nicht gecheatet!");
                continue;
            }

            streichholz += ziehen;

            if (streichholz <= 0) {
                System.out.println("Du hast gewonnen");
                break;
            }
        }
    }
}