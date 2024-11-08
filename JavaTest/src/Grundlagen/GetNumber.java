package Grundlagen;

import java.util.Scanner;

public class GetNumber {
    public static int getNumber() {
        String myNumber = new Scanner(System.in).nextLine();
        return Integer.valueOf(myNumber);

    }

    public static void main(String[] args) {
        System.out.println("Enter You Name:");
        String userName = new Scanner(System.in).nextLine();

        System.out.println("Hi" + userName + ", pls enter A:");
        int a = getNumber();

        System.out.println("pls enter B:");
        int b = getNumber();

        int c = a +b;

        System.out.println("A + B is" + Integer.toString(c));
    }
}
