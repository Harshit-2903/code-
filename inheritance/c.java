class shape{

    void draw(){
        System.out.println("draw");
    }
}

class circle extends shape{

    void calc_area(){
        System.out.println("area");
    }
}

class c {
    
    public static void main(String[] args) {
        circle x = new circle();

        x.draw();
        x.calc_area();
    }
}
