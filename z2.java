class a{

    void aaa(){
        System.out.println("aaaaa----------------");
    }
}


class z2 extends a 
{
   
    
    void aaa(){
        super.aaa();
        System.out.println("aaaaa in z2----------------");
    }

    public static void main(String[] args) {
        a x = new a();
        z2 y = new z2();
        a z = new z2();
    
        x.aaa();
        y.aaa();
        z.aaa();


    }
}