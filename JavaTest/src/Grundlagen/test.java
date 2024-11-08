package Grundlagen;

import java.util.Scanner;

public class test {

    public static String myFunc(){

        int a = 2;
        int b = 5;
        int c = a + b;

        return Integer.toString(c);
    }

    public static int myFunc2(){

        int a = 2;
        int b = 3;
        int c = a + b;

        return c;
    }

    public static int myFunc3(int x, int y){

        return x + y;
    }

   public static String myFunc4(){
        String userName = new Scanner(System.in).nextLine();
        return "hello" + userName;


    }


    public static void main(String[] args) {
        String s = myFunc();
        System.out.println(s);

        int t = myFunc2();
        System.out.println(Integer.toString(t));

        System.out.println(myFunc3(3, 4));

        System.out.println(myFunc4());


    }
}