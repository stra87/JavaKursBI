import java.util.Scanner;
import java.lang.Math;

public class Hausaufgaben_2 {
    public static void main(String[] args) {
        System.out.println("Gebe deine Zahl ein");
        String neueEingabe = new Scanner(System.in).nextLine();
        double neueZahl = Double.valueOf(neueEingabe);
        if (neueZahl > 0) System.out.println("Ist positiv");
        if (neueZahl < 0) System.out.println("Ist negativ");
        if (neueZahl == 0) System.out.println("Ist Null");
        if (neueZahl == Math.floor(neueZahl)) System.out.println("Zahl ist gerade");
        else System.out.println("Zahl ist ungerade");

    }
}
