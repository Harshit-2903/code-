class person{

    void display_name(){
        System.out.println("ABCD....");
    }}
    
    class student extends person {
        
        void display_my_class(){
            
            System.out.println("clg m hu");
        }
    }
    class monitor extends student {
        
        void display_diciplin(){
            
            System.out.println("not diciplined");
        }
    }

    class b {

        public static void main(String[] args) {
            
        
        monitor x = new monitor();

        x.display_name();
        x.display_my_class();
        x.display_diciplin();
        }

    }
