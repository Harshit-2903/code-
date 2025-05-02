 import java.util.Scanner;

class q12 {

    static void  sum_factor(int a) {
        int sum=0;
        System.out.print("the factor of " + a + " are :");
        for (int i = 1; i <= a; i++) {

            if (a % i == 0) {
                sum = sum+i;
                System.out.print(" " + i);
                
            }

        }

        
        System.out.print("\nthe sum of factor of " + a + " are : ");

        System.out.print(sum);

    }

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        System.out.print("enter number :");
        int num = x.nextInt();

        sum_factor(num);

    }

}

