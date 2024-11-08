package Uebungsaufgaben;

import java.util.Scanner;
import java.lang.Math;

public class HA_Verzweigungen_4 {
    public static void main(String[] args) {
        System.out.println("Wie lang ist die erste Seite des Dreiecks?:");
        String enterA = new Scanner(System.in).nextLine();
        double a = Integer.valueOf(enterA);

        System.out.println("Wie lang ist die zweite Seite des Dreiecks?:");
        String enterB = new Scanner(System.in).nextLine();
        double b = Integer.valueOf(enterB);

        System.out.println("Wie lang ist die dritte Seite des Dreiecks?:");
        String enterC = new Scanner(System.in).nextLine();
        double c = Integer.valueOf(enterC);

        if (a + b > c && a + c > b && b + c > a) System.out.println("Es handelt sich um ein Dreieck");
        if (a == b && b == c && a == c) System.out.println("Das Dreieck ist gleichseitig");
        if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
            System.out.println("Das Dreieck ist gleichschenklig");
        }
    }
}