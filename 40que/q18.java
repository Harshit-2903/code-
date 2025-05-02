import java.util.Scanner;
class q18 {

  

    static void prfct_num(int a)
    {   
        int sum=0;
        for (int i = 1; i <a; i++) {

            if (a % i == 0) {
                sum = sum+i;
            }

        }

        if(sum == a){
            System.out.println("Yes it is perfect number");
        }else
        System.out.println("No it is not a perfect number");




    }

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        System.out.print("enter number :");
        int num = x.nextInt();

        prfct_num(num);

    }
    
}
