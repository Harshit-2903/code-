class variable {
    
    int a = 5 ;
    static int b = 10;

    public static void main(String[] args) {
        int c = 56;

        variable x =new variable();
        System.out.println("the value of instance level variable is :"+x.a);
        System.out.println("the value of static variable is : "+b);
        System.out.println("the value of local level variable is : "+c);
    }
    
}
