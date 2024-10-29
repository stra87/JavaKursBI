import java.util.Scanner;

public class Zahlenpyramide {
    public static void main(String[] args) {
        System.out.println("Wie viele Zeilen soll die Pyramide haben?");

        int anzahl = new Scanner(System.in).nextInt();

        int zahl = 1;

        for (int zeile = 1; zeile <= anzahl; zeile++) {
            for (int i = 1; i <= zeile; i++) {
                System.out.print(zahl + " ");
                zahl++;
            }
            System.out.println();
        }
    }
}