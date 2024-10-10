public class conditional_branches {

    public static void main(String[] args) {

        /*
        String sNumber = new Scanner(System.in).nextLine();

        int num = Integer.valueOf(sNumber);

        if (num == 5) {
            System.out.println("match");
        } else {
            System.out.println("not is not 5");
        }
        */

        int a = 5;
        int b = 10;

        if ((a==5) && (b>=2)) {
            System.out.println("cool");
        } else {
            System.out.println("uncool");
        }

        if ( ((a == 5) || (a == 2)) && (b == 10) ) {
            System.out.println("cool");
        } else {
            System.out.println("not a match");
        }

        if (!(a == 5)) {  // das gleiche wie (if (a != 5)
            System.out.println("cool");
        } else {
            System.out.println("not a match");
        }


        /*if(userName =="Kirill") {
            System.out.printIn("cool");
        } else{
            System.out.println.("uncool");
        }*/


    }
}