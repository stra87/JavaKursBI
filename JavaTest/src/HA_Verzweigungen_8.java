import java.util.Scanner;

public class HA_Verzweigungen_8 {
    public static void main(String[] args) {
        int zufall = (int) (Math.random()*100 + 1);

        System.out.println("Welche Zahl wählt Spieler 1 aus 0 von 100?");
        String EingabeZahl1 = new Scanner(System.in).nextLine();
        int Zahl1 = Integer.valueOf(EingabeZahl1);

        System.out.println("Welche Zahl wählt Spieler 2 aus 0 von 100?");
        String EingabeZahl2 = new Scanner(System.in).nextLine();
        int Zahl2 = Integer.valueOf(EingabeZahl2);

        int difZ1 = zufall - Zahl1;
        int difZ2 = zufall - Zahl2;

        if (difZ1 < 0) {
            difZ1 *= -1;
        }

        if (difZ2 < 0) {
            difZ2 *= -1;
        }


        if (difZ1 < difZ2) {
            System.out.println("Zufallszahl: " + zufall);
            System.out.println("Spieler 1 hat gewonnen.");
        }
        if (difZ1 > difZ2) {
            System.out.println("Zufallszahl: " + zufall);
            System.out.println("Spieler 2 hat gewonnen.");
        }

        if (difZ1 == difZ2) {
            System.out.println("Zufallszahl: " + zufall);
            System.out.println("Beide Spieler haben gewonnen.");
        }


    }
}
