import java.util.Scanner;

class X {
    
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.println("enter length of arr ") ;
        int n = inp.nextInt();

        int [] arr = new int[n];

        for(int i=0;i<n;i++){
            System.out.println("enter the value to be inserted ");

            arr[i] = inp.nextInt();
        }

        System.out.print("the array is = ");

        for(int i =0 ;i<arr.length;i++){

            System.out.print(arr[i]);
            System.out.print(" ");
        }

        System.out.println();
        System.out.print("the reverse arr is = ");
        for(int i=arr.length-1;i>=0;i--){

            System.out.print(arr[i]);
            System.out.print(" ");


        }

    }

}
