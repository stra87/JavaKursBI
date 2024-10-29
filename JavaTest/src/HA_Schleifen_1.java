import java.util.Scanner;

public class HA_Schleifen_1 {
    public static void main (String [] args) {

//        System.out.println("Teilaufgabe 1:");
//        for (int i1 = 0; i1 <= 10; i1++) {
//            System.out.println(Integer.toString(i1));
//        }
//
//        System.out.println("Teilaufgabe 2:");
//        for (int i2 = -10; i2 <= 10; i2 = i2 +2) {
//            System.out.println(Integer.toString(i2));
//        }
//
//        System.out.println("Teilaufgabe 3:");
//        for (int i3 = 0; i3 < 100; i3 = i3 + 3) {
//            System.out.println(Integer.toString(i3));
//        }

//        System.out.println("Teilaufgabe 4:");
//        for (int i4 = 1; i4 < 1000; i4 = i4 * 2) {
//            System.out.println(Integer.toString(i4));
//        }
//
//        System.out.println("Teilaufgabe 5:");
//        for (int i5 = 1; i5 < 1000; i5 = i5 * 2) {
//            System.out.println(Integer.toString(i5));
//        }

        System.out.println("Teilaufgabe 6:");
            int i6 = 1;
            int i6_triangular = 0;

            while (i6_triangular < 100) {
                System.out.println(i6_triangular);
                i6_triangular = (i6 * (i6 + 1)) / 2;
                i6++;
            }
            int i6b = 0;
            int summand = 1;

            while (i6b < 100) {
                System.out.println(i6b);
                i6b += summand;
                summand += 1;
            }




//        System.out.println("Teilaufgabe 7:");
//        System.out.println("Bitte gib deine Startzahl ein :");
//        int i7a = new Scanner(System.in).nextInt();
//
//        System.out.println("Bitte gib deine Endzahl ein :");
//        int i7b = new Scanner(System.in).nextInt();
//
//        System.out.println("Bitte gib deine Schrittweise ein :");
//        int i7s = new Scanner(System.in).nextInt();
//
//        do {
//            System.out.println(i7a);
//            i7a += i7s;
//        } while (i7a <= i7b);
    }
}
