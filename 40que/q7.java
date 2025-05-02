import java.util.Scanner;

class q7 {

    public static void sum_of_digit(int a) {
        int sum = 0;

        while (a > 0) {
            int i = a % 10;
            sum = sum + i;
            a = a / 10;

        }

        System.out.println("the sum of digits in " + a + " is : " + sum);
    }

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.print("enter a number : ");
        int a = x.nextInt();

        sum_of_digit(a);

    }

}
