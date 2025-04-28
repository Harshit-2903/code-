
class missing_number  {

    public static void main (String[]args)
     {
        
        int[]a = {1,2,4};
        int sum = 0;
        int actsum = 0;
 
        for(int i = 0 ;i<a.length;i++){
            sum = sum+ a[i];
        }

        int max =0;
        for(int i = 0 ; i < a.length;i++){
            if(max<a[i]){
                max = a[i];
            }
        }
        // System.out.println(max);

        for(int i = max ;i>0;i--){
           actsum = actsum+ i;
        }

        int mn = actsum-sum; 

        System.out.println("the missing number is : " +mn );




    } 
    

    
    
}
