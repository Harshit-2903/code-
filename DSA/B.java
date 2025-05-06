// negative number to beginning

import java.util.Scanner;

class B {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        System.out.print("enter length of array : ");
        int length = inp.nextInt();

        int [] x = new int[length];
        
        for(int i=0 ; i<x.length;i++){
            System.out.print("Enter value to be inserted in x["+i+"] :");
            x[i]=inp.nextInt();

        }

        int temp =-1,negative=-1;

        for (int i=0 ; i<x.length;i++) {
                
            if(x[i] < 0) 
            {

               temp++;
            negative++;
               int y = x[temp];
                if(negative == 0){
               for(int k=temp ; k>=0;k--){
                    x[k-1]  =   x[k];
               }}
               else
               {
                for(int k=temp ; k>=negative+1;k--){
                    x[k-1]  =   x[k];
               }    
               }

            }else{
                temp++;
            }
            

            for (int nxt : x) {
                    System.out.println(nxt);
            }

        }




    }
    
}
