import java.util.Scanner;

class K {
    

    public static void main(String[] args) {

        int  num1,num2,res;
         char a;
        Scanner myObj = new Scanner(System.in);

        System.out.println("enter 1st number");
        num1= myObj.nextInt();

        System.out.println("enter 2nd number");
        num2= myObj.nextInt();

        System.out.println("enter operation to be done");
        a= myObj.next().charAt(0);


        switch(a){
            
            case '+' :
            res = num1+num2;
            System.out.println(res);
            break;
            

            case '-' :
            res = num1-num2;
            System.out.println(res);
            break;

            case '*' :
            res = num1*num2;
            System.out.println(res);
            break;
            
            case '/' :
            res = num1/num2;
            System.out.println(res);
            break;

            default:
            System.out.println("dekh k dal ");
            break;


        }
        
    }



}
