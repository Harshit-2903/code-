import java.util.Scanner;

class q23 {

    static boolean is_armstrong(int a) {
        int num = a;
        int len = String.valueOf(a).length();
        int sum = 0;
        while (a > 0) {
            int i = a % 10;
            int mult = 1;
            for (int j = 0; j < len; j++) {

                mult = mult * i;

            }

            sum = sum + mult;
            a = a / 10;

        }

        if (sum == num) {

            return true;
        } else {

            return false;
        }

    }

    static void armstrong(int a,int b) {

        System.out.print("Armstrong number from " +a + " to "+b + "are : ");

        for (int i = a; i <= b; i++) {

            if (is_armstrong(i)) {
                System.out.print(" " + i);
            }
        }
    }

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in); 

       System.out.print("enter 1st number : ");
       int a = x.nextInt();
       System.out.print("\nenter 2nd number : ");
       int b = x.nextInt();

       armstrong(a,b);


    }

}
 