class A 
{
  
    void sum(int a , int b)
    {
        System.out.println("The sum is : "+a+b);
    }
    
    void sum(int a , int b,int c)
    {
        System.out.println("The sum of 3 int value is : "+a+b+c);
    }
    
    void sum(double a , double b)
    {
        System.out.println("The sum of 3 double value is : "+a+b);
    }


    public static void main(String[] args) {

        A x =new A();

        x.sum(2,3);
        x.sum(2,3,4);
        x.sum(2000d,100);



    }




}
