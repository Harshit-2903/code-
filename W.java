import java.util.Scanner;

class W {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("enter value of array");
        int n = inp.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {

            System.out.println("enter value to be inserted in arr");
            arr[i] = inp.nextInt();
        }

        System.out.println();

        System.out.print("the values in arr are :");
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i]);
            System.out.print(" ");
        }

        int sum = 0;
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        System.out.println("sum of arr is : " + sum);

    }

}
