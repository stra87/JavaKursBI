import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* List of Operators:
        ==  A is equal B
        !=  A is not B
        >   A is bigger than B
        <   A is smaller than B
        <=  A is less or equal B
        !   not A

        &&  AND (both are the same)
        ||  OR  (both can be different)
        ^   XOR (returns true if both inputs are different)
        */

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

