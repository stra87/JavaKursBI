package Uebungsaufgaben;

public class HA_Verzweigungen_7 {
    public static void main(String[] args) {
        double zufall = Math.random();

        if (zufall < 0.39) System.out.println("Du hast gewonnen. Die Zahl ist " + zufall);
        else System.out.println("Du hast verloren. Die Zahl ist " + zufall);
    }
}