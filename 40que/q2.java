import java.util.Scanner;

class q2 {
    

     public static void natural_number(int a ,int b ) {

        System.out.print("even number between " +a +" and "+b + "are : ");


    while(a<=b){

        if (a%2 == 0) {
            System.out.print(" " +a );
        }

        a++;
    }
        
     }



     public static void main(String[] args) {

        System.out.print("enter 1st number :");

        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();

        System.out.println();

        System.out.print("enter 2nd number :");
        int b = inp.nextInt();

        natural_number(a, b);


     }
}
