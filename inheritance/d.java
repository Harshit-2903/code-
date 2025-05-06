 class device{

    void power_on(){
        System.out.println("power_on....");
    }}
    
    class laptop extends device {
        
        void boot(){
            
            System.out.println("booting");
        }
    }

    class gaming_laptop extends laptop {
        
        void start_gaming(){
            
            System.out.println("gameing chalu kro");
        }
    }

    class d {

        public static void main(String[] args) {
            
        
       gaming_laptop x = new gaming_laptop();

        x.power_on();
        x.boot();
        x.start_gaming();
        }
    
}
