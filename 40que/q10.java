import java.util.Scanner;
public class q10 {

    public static void reverse(int a) {
        int count = 1;
        int yes = 0;
        int l = 0;
        int len = String.valueOf(a).length();
        int k = len - 1;
        int[] num = new int[len];
        int[] rev = new int[len];
       
        while (a > 0) {
            int i = a % 10;
            num[k] = i;
            k--;
            a = a / 10;

        }

          k=len-1;
        for (int i = 0; i < num.length; i++) {
          
            rev[i] = num[k];
            k--;

        }

        for (int i = 0; i < rev.length; i++) {

            if(num[i] == rev[i]){
                yes++;
            
            }

            
        }
        
        if(yes == len){
            System.out.println("Yes it is a palindrome");
        
        }else{
        System.out.println("No it is not a palindrome");
    }
}

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.print("enter a number : ");
        int a = x.nextInt();

        reverse(a);

    }

}
    
