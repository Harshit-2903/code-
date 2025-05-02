import java.util.Scanner;
public class q20 {
    static boolean is_prfctnum(int a)
    {   
        int sum=0;
        for (int i = 1; i <a; i++) {

            if (a % i == 0) {
                sum = sum+i;
            }

        }

        if(sum == a){
           return true;
        }else
        return false;


    }
    
    static void prfct_num(int a , int b){

        System.out.print("Perfect number from 1 to 100 are : " );

        for(int i= a ; i<=b;i++){
            if(is_prfctnum(i)){
                System.out.print(" "+i);
            }
        }

    }

    public static void main(String[] args) {

       Scanner x = new Scanner(System.in); 

       System.out.println("enter 1st number : ");
       int a = x.nextInt();
       System.out.println("enter 2nd number : ");
       int b = x.nextInt();
        prfct_num(a, b);

    }
}
