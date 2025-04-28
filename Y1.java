import java.util.Scanner;

class Y1 {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.println("enter length of arr 1 ") ;
        int n = inp.nextInt();

        System.out.println("enter length of arr 2  ") ;
        int m = inp.nextInt();

        int [] arr = new int[n];
        int [] arrr = new int[m];

        for(int i=0;i<n;i++){
            System.out.println("enter the value to be inserted in arr 1 ");

            arr[i] = inp.nextInt();
        }

        for(int i=0;i<n;i++){
            System.out.println("enter the value to be inserted in arr 2 ");

            arrr[i] = inp.nextInt();
        }

        System.out.print("array 1 is = ");

        for(int i =0 ;i<arr.length;i++){

            System.out.print(arr[i]);
            System.out.print(" ");
        }
        System.out.println();
        System.out.print("array 2 is = ");

        for(int i =0 ;i<arr.length;i++){

            System.out.print(arrr[i]);
            System.out.print(" ");

        }

        System.out.println();
        int sum  = 0;

        for(int i = 0 ; i<arr.length ; i++ ){
            sum = sum+arr[i]+arrr[i];
        }

        System.out.print("sum of both arr is : " +sum );
        
    }
}
