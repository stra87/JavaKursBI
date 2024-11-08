package Uebungsaufgaben;

import java.util.Scanner;

public class HA_Verzweigungen_5 {
    public static void main(String[] args) {
        double Guthaben = 136.34;
        System.out.println("Wieviel Geld wollen Sie abheben?");
        String neueEingabe = new Scanner(System.in).nextLine();
        double neueZahl = Double.valueOf(neueEingabe);

        if (neueZahl < Guthaben) System.out.println("Es werden " + neueZahl + " € ausgezahlt.");
        else System.out.println("Keine Auszahlung! Dieser Betrag übersteigt Ihr Guthaben.");
    }
}
