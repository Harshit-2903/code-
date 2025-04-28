import java.util.Scanner;

class Z {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("enter the length of array : ");
        int len = sc.nextInt();

        int[] arr = new int[len];
        int sum = 0, max = 0, max1 = 0, temp = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.print("enter value to be inserted : ");
            arr[i] = sc.nextInt();

        }

        System.out.print("The array is : ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }

        System.out.println("\n---------------------------------------------------------------------------------\n");

        System.out.print( "press 1 for finding odd number in an array : \npress 2 for finding even number in an array : \npress 3 for adding two array : \npress 4 for finding 1st maximum in an array : \npress 5 for finding 2nd maximum in an array :");
        int res = sc.nextInt();

        switch (res) {
            case 1:

                System.out.print("odd number in array are :");
                for (int i = 0; i < arr.length; i++) {

                    if (arr[i] % 2 != 0) {

                        System.out.print(arr[i]);
                        System.out.print(" ");
                    }

                }
                System.out.println("\n---------------------------------------------------------------------------------\n");
                break;

            case 2:

                System.out.print(" Even number in array are :");
                for (int i = 0; i < arr.length; i++) {

                    if (arr[i] % 2 == 0) {

                        System.out.print(arr[i]);
                        System.out.print(" ");
                    }
                }
                System.out.println();
                System.out.print("---------------------------------------------------------------------------------\n");

                break;

            case 3:

                System.out.println("enter value length of 2nd array");
                int len2 = sc.nextInt();

                if(len != len2){
                    System.out.print(" \n Error : length of array are not same cannot add them !!!!!!!! ");
                    System.out.print("\n-------------------------------------------------\n");
                }

                int[] arrr = new int[len2];

                for (int i = 0; i < arrr.length; i++) {
                    System.out.print("enter value to be inserted : ");
                    arrr[i] = sc.nextInt();

                }

                System.out.print("The 1st array is : ");

                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i]);
                    System.out.print(" ");
                }

                System.out.println();

                System.out.print("The 2nd array is : ");

                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arrr[i]);
                    System.out.print(" ");

                }

                System.out.println();

                for (int i = 0; i < arr.length; i++) {

                    sum = sum + arrr[i] + arr[i];

                }
                System.out.print("the sum of two array is : " + sum);

                
                System.out.println("\n---------------------------------------------------------------------------------\n");

                break;

            case 4:

                for (int i = 0; i < arr.length; i++) {

                    if (max < arr[i]) {
                        max = arr[i];
                    }
                }
                System.out.println("the max value in array is : " + max);

                System.out.println("\n---------------------------------------------------------------------------------\n");

                break;

            case 5:

                for (int i = 0; i < arr.length; i++) {
                    temp = arr[i];
                    if (temp != max) {
                        if (max1 < arr[i]) {
                            max1 = arr[i];
                        }
                    }
                }

                System.out.println("the max value in array is : " + max1);

                System.out.println("\n---------------------------------------------------------------------------------\n");

                break;

            default:

                System.out.println("wrong input " + "\n please enter number from 1 to 5 ");
                System.out.println("\n---------------------------------------------------------------------------------\n");
        }
    }
}
