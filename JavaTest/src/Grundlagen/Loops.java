package Grundlagen;

public class Loops {
    public static void main(String[] args) {

//        for (int i = 0; i < 10; i = i +2) {
//            System.out.println(Integer.toString(i));
//        }
//
//        int j = 0;
//        while (j < 10) {
//            System.out.println(Integer.toString(j));
//            j++;
//        }
//
//        int i1 = 0;
//        boolean b = false;
//        while (!b) {
//            System.out.println(Integer.toString(i1));
//            i1++;
//            if (i1 == 10) b = true;
//            if (i1 == 12) continue;
//            if (i1 == 10) break;
//        }


//        long number = Math.round(Math.random() * 12);
//        int a = 0;
//
//        while (true) {
//            System.out.println("Rate Zahl");
//            String sNumber = new Scanner(System.in).nextLine();
//            long num = Integer.valueOf(sNumber);
//
//            if (number == num) {
//                System.out.println("Endlich");
//                break;
//            }
//            a++;
//            if (a == 10) {
//                System.out.println("Pechvogel");
//                break;
//            }
//        }

//        final int maxNumber = 4;
//
//        long number2 = Math.round(Math.random() * maxNumber);
//
//        int counter = 0;
//        long num = -1;
//        long oldnum = -1;
//
//        while (number2 != num) {
//            num = Math.round(Math.random() * maxNumber);
//            if (oldnum == num) {
//                System.out.println("nochmal?");
//                continue;
//            }
//
//            oldnum = num;
//
//            counter++;
//        }
//
//        System.out.println("Wir haben so viele Versuche gebraucht");
//        System.out.println(Integer.toString(counter));

        double x = 5.5;
        double y = 0.3;

        do {
            x += y;
            System.out.println("Hallo");
        }
        while (x < 3);

        while (x < 3) {
            x += y;
            System.out.println("Tschüss");
        }




    }
}
