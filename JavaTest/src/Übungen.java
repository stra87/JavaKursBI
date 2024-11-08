import java.util.Scanner;

public class Übungen {

    public static void Fahrenheit() {
        System.out.println("Geben Sie eine Temperatur in Grad Celcius ein:");
        String temp_cel = new Scanner(System.in).nextLine();

        float cel = Float.valueOf(temp_cel);

        float fahrenheit = cel * 9 / 5 + 32;

        System.out.println("\nDas ist die Temperatur in Fahrenheit " + fahrenheit + "\n");
        }

    public static void Multiplikation() {
        System.out.println("Geben Sie eine Zahl ein:");
        String Szahl = new Scanner(System.in).nextLine();

        int zahl = Integer.valueOf(Szahl);

        for (int i = 1; i <= 10; i++) {
            System.out.println(zahl + "x" + i + "=" + zahl * i);
        }
    }





public static void main (String[] args) {
        Übungen.Fahrenheit();
        Übungen.Multiplikation();
    }
}

