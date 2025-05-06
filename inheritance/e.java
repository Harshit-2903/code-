class book
{
    void read(){
        System.out.println("reading......");
    }
}

class Novel extends book {

    void Story_Line() {
            System.out.println("story_line.....");

    }
}

class e {

    public static void main(String[] args) {
        Novel obj = new Novel();

        obj.read();
        obj.Story_Line();
    }

}
