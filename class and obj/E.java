import java.util.Scanner;

class account {

        String account_number;
    String account_holder;
    double balance = 0;
    int res,dep,widraw;
    Scanner inp = new Scanner(System.in);
  
   void acc() {
         boolean a =true;
        System.out.print("Enter your name : ");
        account_holder = inp.nextLine();

        System.out.print("\nEnter your account number : ");
        account_number = inp.nextLine();

        

        System.out.print("\n press 1 to Withdraw and 2 to Deposit and 3 to check balance and 4 to exit ");
        res = inp.nextInt();
        switch (res) {
            case 1:
                if (balance == 0) {
                    System.out.println("you dont have money in your account  " + account_number);
                }
                else{
                    System.out.print("Enter amount to be withdrawn : ");
                    int widraw = inp.nextInt();
                    if(balance<widraw){
                        System.out.println("Insufficient Balance in account.....");
                    }else{
                        balance -= widraw;

                        System.out.println("Rs." + widraw + " withdrawn from account " + account_number);
                    }

                    break;
                }

            case 2:
                    System.out.print("Enter amount to be deposited : ");
                    int dep = inp.nextInt();

                    balance += dep;

                    System.out.println("Rs." + dep + " deposited in account " + account_number);

                    break;

                    case 3:
                     System.out.println("you balance for account "+account_number+ " is Rs "+balance);
                     break;

            default:
            System.out.println("Thank you ................");
               a= false;
        }

    }
   

   void info () {

    System.out.println( " "+ account_holder +" your balance for account "+account_number+ " is Rs "+balance);

   }
}

class E {

    public static void main(String[] args) {
        account x = new account();
        x.acc();
        account y = new account();
        y.acc();    
        account z = new account();
        z.acc();

        x.info();
        y.info();
        z.info();
    }

}