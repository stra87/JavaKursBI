import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("Enter number 1");
        String s1 = new Scanner(System.in).nextLine();

        System.out.println("Enter number 2");
        String s2 = new Scanner(System.in).nextLine();

        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);

        int c = a + b;



        System.out.println("Number is:");
        System.out.println(c);
    }
}

