class Q {
    
    public static void main(String[] args) {
        int i = 123;
        int sum = 0;

        while(i>0)
        {
            sum = sum+ i%10;

            i=i/10;

        }

        System.out.println(sum);

    }

}


