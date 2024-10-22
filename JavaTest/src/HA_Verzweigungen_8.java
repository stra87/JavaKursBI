import java.util.Scanner;

public class HA_Verzweigungen_8 {
    public static void main(String[] args) {
        int zufall = (int) (Math.random()*100 + 1);

        System.out.println("Welche Zahl wählt Spieler 1 aus 0 von 100?");
        String EingabeZahl1 = new Scanner(System.in).nextLine();
        double Zahl1 = Double.valueOf(EingabeZahl1);

        System.out.println("Welche Zahl wählt Spieler 2 aus 0 von 100?");
        String EingabeZahl2 = new Scanner(System.in).nextLine();
        double Zahl2 = Double.valueOf(EingabeZahl2);

    }
}
