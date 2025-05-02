import java.util.Scanner;
class q16{

    static boolean prime(int a) {
        int count = 0;

        for (int i = 1; i <= a; i++) {

            if (a % i == 0) {
                count++;

            }

        }

        if (count == 2 || count ==1) {
            return true;
        } else
            return false;

    }

    static void prime_num(int a,int b) {
        int count = 0;
        

        System.out.print("prime number from "+a +" to "+b+" are : ");

        for (int i = a; i <= b; i++) {

            if(prime(i)){
                System.out.print(" "+i);
            }

        }
    }


    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        System.out.print("enter 1st number :");
        int num1 = x.nextInt();
        System.out.print("\nenter 2nd number :");
        int num2 = x.nextInt();

        if(num1<num2){
            System.out.println("1st number should be greater");
        }

        prime_num(num1,num2);

    }
    
}

    

