package Grundlagen;

import java.util.Scanner;

public class NimSpiel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Erweiterung: Benutzerdefinierte Eingaben für Startanzahl und maximale Züge
        System.out.print("Anzahl der Startstreichhölzer: ");
        int startStreichhoelzer = scanner.nextInt();
        System.out.print("Maximale Anzahl der wegzunehmenden Streichhölzer (1-3): ");
        int maxZug = scanner.nextInt();

        // Überprüfen, ob die Eingaben gültig sind
        if (startStreichhoelzer < 1 || maxZug < 1 || maxZug > 3) {
            System.out.println("Ungültige Eingaben. Startanzahl der Streichhölzer muss mindestens 1 sein, und maximale Zuganzahl 1-3.");
            return;
        }

        int streichhoelzer = startStreichhoelzer;
        int aktuellerSpieler = 1;

        while (streichhoelzer > 0) {
            System.out.println("Streichhölzer übrig: " + streichhoelzer);
            System.out.print("Spieler " + aktuellerSpieler + ", wie viele Streichhölzer möchtest du nehmen (1 bis " + Math.min(maxZug, streichhoelzer) + ")? ");
            int zug = scanner.nextInt();

            // Überprüfen der Eingabe
            if (zug < 1 || zug > maxZug || zug > streichhoelzer) {
                System.out.println("Ungültiger Zug. Wähle eine Zahl zwischen 1 und " + Math.min(maxZug, streichhoelzer) + ".");
                continue;
            }

            // Entfernen der Streichhölzer und Wechsel zum nächsten Spieler
            streichhoelzer -= zug;

            if (streichhoelzer == 0) {
                System.out.println("Spieler " + aktuellerSpieler + " hat das letzte Streichholz genommen und gewonnen!");
            } else {
                // Wechsel zum anderen Spieler
                aktuellerSpieler = (aktuellerSpieler == 1) ? 2 : 1;
            }
        }

        scanner.close();
    }
}
