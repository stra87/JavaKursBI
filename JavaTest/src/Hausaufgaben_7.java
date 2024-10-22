import java.util.Scanner;


public class Hausaufgaben_7 {
    public static void main(String[] args) {
        System.out.println("Welche Zahl wählst du zwischen 0 und 1?");
        String EingabeZahl = new Scanner(System.in).nextLine();
        double Zahl = Double.valueOf(EingabeZahl);

        double zufall = Math.random();

        System.out.println(zufall);
    }
}
