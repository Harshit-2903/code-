 
  import java.util.Scanner;

 class Y {
    
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
        System.out.print("the even no in arr are = ");
        for(int i=0;i<arr.length;i++){

            if(arr[i]%2 == 0){
            System.out.print(arr[i]);
            System.out.print(" ");
            }


        }

        System.out.println();
        System.out.print("the odd no in arr are = ");

        for(int i=0;i<arr.length;i++){

            if(arr[i]%2 != 0){
            System.out.print(arr[i]);
            System.out.print(" ");
            }


        }

    }

}


