import java.util.Scanner;

class q4
{
   public static void natural_num(int a) {
        int sum1 =0;
    
        System.out.print("The sum of natural number till " +a + " are : ");

        for(int i =a; i>=1 ;i--)
        {
            sum1 = sum1 + i;

        }

        System.out.print(sum1) ;
        

    }

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        
        System.out.print("enter a number : ");
        int a = inp.nextInt();

        natural_num(a);

    }
        
    

    
}
