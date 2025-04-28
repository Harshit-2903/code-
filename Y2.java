import java.util.Scanner;
class Y2 {  

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("enter length of arr : ") ;
        int n = inp.nextInt();

        int [] arr = new int[n];
        System.out.println();


        for(int i=0;i<n;i++){
            System.out.print("enter the value to be inserted : ");

            arr[i] = inp.nextInt();
            System.out.println();
        }

        System.out.print("the array is = ");

        for(int i =0 ;i<arr.length;i++){

            System.out.print(arr[i]);
            System.out.print(" ");
        }

        System.out.println();
        
        int max1 =0;
        
        for(int i = 0 ;i<arr.length ; i++ ){
            
            if(max1<arr[i]){
                max1= arr[i];
                
            }}
            
            System.out.print( "the 1st maximum value in arr is : " +max1);
            System.out.println();
            int max2 =0;

        for(int i =0;i<arr.length ; i++ ){

                int temp = arr[i];
            
            if(temp != max1){
            if(max2<arr[i]  ){
            max2= arr[i];
            }
        }
    }
      System.out.print("the 2nd  maximum is : " +max2);
    }
}
