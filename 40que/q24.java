import java.util.Scanner;

class q24 {

    static void harshad(int a)
    {   
        int num=a;
        int sum =0;
        while(a>0)
        {
            int i = a%10;
            sum +=i;
            a=a/10;
        }


        if(num % sum == 0){
            System.out.println("yes it is harshad number");
        }else{
            System.out.println("NO it is not aharshad number");
        }

    }

    
    public static void main(String[] args) {
        
        Scanner x = new Scanner(System.in);

        System.out.print("enter a number : ");
        int y = x.nextInt();

        harshad(y);
    }
    
}
