import java.util.Scanner;

class q5
{
   public static void natural_num(int a) {
        int mult =1;
    
        System.out.print("The product of natural number till " +a + " are : ");

        for(int i =a; i>=1 ;i--)
        {
            mult = mult * i;

        }

        System.out.print(mult) ;
        

    }

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        
        System.out.print("enter a number : ");
        int a = inp.nextInt();

        natural_num(a);

    }
        
    

    
}
