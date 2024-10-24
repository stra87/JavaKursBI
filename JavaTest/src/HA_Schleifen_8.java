import java.util.Scanner;

public class HA_Schleifen_8 {
    public static void main (String [] args) {

        System.out.println("Wie viele Zahlen möchtest du ausgeben? (1-100)");
        int anzahl = new Scanner(System.in) .nextInt();
        int summe = 0;
        int min = 10000;
        int max = 0;

        for (int counter = 0; counter < anzahl; counter++) {

            int zufallszahl = (int) ((Math.random() * 9000) + 1000);

            summe += zufallszahl; // Summe der Zufallszahlen

            if (zufallszahl < min) min = zufallszahl;

            if (zufallszahl > max) max = zufallszahl;

            System.out.println("Das ist die Zufallszahl: " + zufallszahl);

        }
        System.out.println("");
        System.out.println("Das ist die kleinste Zahl: " + min );
        System.out.println("Das ist die größte Zahl: " + max);
        System.out.println("Mittelwert ist: " + (summe/anzahl));
    }
}
