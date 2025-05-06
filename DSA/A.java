import java.util.Scanner;

class A {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        System.out.print("enter length of array : ");
        int length = inp.nextInt();

        int [] x = new int[length];
        
        for(int i=0 ; i<x.length;i++){
            System.out.print("Enter value to be inserted in x["+i+"] :");
            x[i]=inp.nextInt();

        }

        int max = x[0] ,min = x[0];

        for(int i=0; i<x.length ; i++){

            if(max < x[i]){
                max=x[i];
            }else if (min > x[i]){
                min = x[i];
            }

        }

        System.out.println("The maximum number in your array is : "+max);
        System.out.println("The minimum number in your array is : "+min);


    }
}