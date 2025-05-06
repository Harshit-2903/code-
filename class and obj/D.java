import java.util.Scanner;

class rectangle{


    int length,breadth;

    private void calc(int a,int b)
    {   
        
        System.out.println("Area of rectangle is : " +a*b );

        System.out.println("Perimeter of rectangle is : " + 2*(a+b ));
    }

    void info(){
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter length :");
        length = inp.nextInt();
        System.out.print("Enter breadth :");
        breadth = inp.nextInt();

        calc(length,breadth);
    }

}


class D {   

    public static void main(String[] args) {

        rectangle x = new rectangle();
        x.info();
        rectangle y = new rectangle();
        y.info();
        rectangle z = new rectangle();
        z.info();

    }
    
}
