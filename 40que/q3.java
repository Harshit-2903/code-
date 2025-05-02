 import java.util.Scanner;

class q3
{

    public static void natural_num(int a) {
    
        System.out.print("The natural number till " +a + "are : ");

        for(int i =a; i>=1 ;i--)
        {
            
            System.out.print(" " +i);

        }
        

    }

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        
        System.out.print("enter a number : ");
        int a = inp.nextInt();

        natural_num(a);

    }
        
    

    
}
