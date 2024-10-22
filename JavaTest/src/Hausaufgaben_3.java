import java.util.Scanner;

public class Hausaufgaben_3 {
    public static void main(String[] args) {
        System.out.println("Wie hoch ist der Auftragswert?");
        String neueEingabe = new Scanner(System.in).nextLine();
        double neueZahl = Double.valueOf(neueEingabe);


        double Versand = 3.5;
        if (neueZahl >= 100) Versand = 0;
        if (neueZahl >= 200) neueZahl *= 0.98;

        System.out.println("Der Gesamtbetrag beträgt" + " " + (neueZahl += Versand) + " €");
    }
}
