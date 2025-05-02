class q15 {

    static boolean prime(int a) {
        int count = 0;

        for (int i = 1; i <= a; i++) {

            if (a % i == 0) {
                count++;

            }

        }

        if (count == 2 || count ==1) {
            return true;
        } else
            return false;

    }

    static void prime_num() {
        int count = 0;
        int a = 100;

        System.out.print("prime number from 1 to 100 are : ");

        for (int i = 1; i <= a; i++) {

            if(prime(i)){
                System.out.print(" "+i);
            }

        }
    }

    public static void main(String[] args) {
        prime_num();

    }

}
