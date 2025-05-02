
class q19 {

  

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
    
    static void prfct_num(){

        System.out.print("Perfect number from 1 to 100 are : " );

        for(int i= 0 ; i<=100;i++){
            if(is_prfctnum(i)){
                System.out.print(" "+i);
            }
        }

    }

    public static void main(String[] args) {

       

        prfct_num();

    }
    
}
