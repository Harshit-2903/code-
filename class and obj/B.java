import java.util.Scanner;

class Student1 {

    String name;
    int roll_no;
    int marks;

     Student1() {

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter student name : ");
        name = inp.nextLine();

        System.out.print("Enter roll number : ");
        roll_no = inp.nextInt();

        System.out.print("Enter marks : ");
        marks = inp.nextInt();

        display();

    }

    private void display() {

        System.out.println(name);
        System.out.println(roll_no);
        System.out.println(marks);

    }

}

class B {

    public static void main(String[] args) {
        Student1 x = new Student1();
     
        Student1 y = new Student1();
     
        Student1 t = new Student1();
      


    }
}