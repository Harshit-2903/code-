import java.util.Scanner;
public class q21 {


    static void is_armstrong(int a){
        int num =a;
        int len = String.valueOf(a).length();
        int sum =0;
        while(a>0){
            int i = a%10;
            int mult = 1;
            for(int j=0;j<len;j++){

                mult = mult*i;

            }

            sum = sum+mult;
            a=a/10;

        }



        if(sum == num){
            System.out.println("Yes it is armstrong number");
            return ;
        }
        else{
            System.out.println("No it is not a armstrong number");
            return;
        }

    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int x = inp.nextInt();

        is_armstrong(x);        
    }
    
}
