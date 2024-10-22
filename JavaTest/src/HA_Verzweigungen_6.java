import java.util.Scanner;

public class HA_Verzweigungen_6 {
    public static void main(String[] args) {
        System.out.println("Wie alt bist du?");
        String age_input = new Scanner(System.in).nextLine();
        int Alter = Integer.valueOf(age_input);

        System.out.println("Wie heißt du?");
        String name_input = new Scanner(System.in).nextLine();

        System.out.println("Welches Geschlecht hast du?");
        String sex_input = new Scanner(System.in).nextLine();

        if (sex_input.equals("männlich") && Alter >= 18) System.out.println("Guten Tag Herr " + name_input);
        if (sex_input.equals("weiblich") && Alter >= 18) System.out.println("Guten Tag Frau " + name_input);
        else System.out.println("Hallo " + name_input);
    }
}
