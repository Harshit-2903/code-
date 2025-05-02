import java.util.Scanner;

class q11 {

    static void factor(int a) {
        System.out.print("the factor of " + a + " are :");
        for (int i = 1; i <= a; i++) {

            if (a % i == 0) {
                System.out.print(" " + i);
            }

        }

    }

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        System.out.print("enter number :");
        int num = x.nextInt();

        factor(num);

    }

}
