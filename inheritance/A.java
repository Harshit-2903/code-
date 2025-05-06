class A1
{
    void pro(){
        System.out.println("  Meathod of class A1.....  ");
    }
}
class A2 extends A1
{
    void info(){
        System.out.println(" meathod pf class A2.....  ");
    }
}


class A extends A2 
{

    
    void aaa(){
        System.out.println("meathod of class A....");
    }
    
    public static void main(String[] args) {
       
        A x = new A();
        
        x.pro();
        x.info();
        x.aaa();
        
        
    }
    
}