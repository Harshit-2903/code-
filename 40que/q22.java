
class q22 {

    static boolean is_armstrong(int a) {
        int num = a;
        int len = String.valueOf(a).length();
        int sum = 0;
        while (a > 0) {
            int i = a % 10;
            int mult = 1;
            for (int j = 0; j < len; j++) {

                mult = mult * i;

            }

            sum = sum + mult;
            a = a / 10;

        }

        if (sum == num) {

            return true;
        } else {

            return false;
        }

    }

    static void armstrong() {

        System.out.print("Armstrong number from 1 to 100 are : ");

        for (int i = 1; i <= 100; i++) {

            if (is_armstrong(i)) {
                System.out.print(" " + i);
            }
        }
    }

    public static void main(String[] args) {

        armstrong();
    }

}
