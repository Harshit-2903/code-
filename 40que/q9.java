import java.util.Scanner;

class q9 {

    public static void reverse(int a) {
        int count = 1;
        int len = String.valueOf(a).length();
        int k = len - 1;
        int[] num = new int[len];
        int[] rev = new int[len];

        while (a > 0) {
            int i = a % 10;
            num[k] = i;
            k--;
            a = a / 10;

        }

        for (int i = 0; i < num.length; i++) {
            rev[i] = num[len - 1];
            len--;

        }

        System.out.print("the reverse of number is : ");

        for (int i = 0; i < rev.length; i++) {
            System.out.print(rev[i] + " ");
        }
    }

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.print("enter a number : ");
        int a = x.nextInt();

        reverse(a);

    }

}
