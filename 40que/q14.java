import java.util.Scanner;
class q14 {

     static void prime(int a) {
        int count =0;
       
        for (int i = 1; i <= a; i++) {

            if (a % i == 0) {
                 count++;

            }

        }

        if(count == 2){
            System.out.println("yes it is a prime number");
        }else
        System.out.println("No it is not a prime number");



    }

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        System.out.print("enter number :");
        int num = x.nextInt();

        prime(num);

    }
    
}
