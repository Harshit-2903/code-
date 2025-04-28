 
 class fnc {

    int sum(int a , int b ){

        return a+b;
    }
    
    static int sum1(int a , int b ){

        return a+b;
    }

    public static void main(String[] args) {
        fnc s = new fnc();
        System.out.println(s.sum(5,6));
        System.out.print(sum1(4,5));
        
    }

   
}
