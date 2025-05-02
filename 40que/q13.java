import java.util.Scanner;

class q13 {
     static void count_factor(int a) {
        int count =0;
        System.out.print("the factor of " + a + " are :");
        for (int i = 1; i <= a; i++) {

            if (a % i == 0) {
                System.out.print(" " + i);
                count++;

            }

        }

        System.out.print("\nthe count of factor are : "+count);

    }

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        System.out.print("enter number :");
        int num = x.nextInt();

        count_factor(num);

    }

}
