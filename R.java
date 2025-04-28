class R {

    public static void main(String[] args) {
        int i = 1001;
        int original = i;
        int digit;
        int res =0;
        

        while (i > 0) {
            digit = i % 10;
            res = res * 10 + digit;
            i = i / 10;

        }

        if (original == res) {
            System.out.println("yes");
        } else {
            System.out.println("no");   
        }

    }

}
