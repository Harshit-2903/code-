 class S {

    public static void main(String[] args) {

        int n = 90;
        int i;
        double fact=1d;

        for(i=n;i>0;i--){

            fact = fact *i;
        }

        System.out.println("the factorial of "+ n + " is :" + fact);


    }
    
}
