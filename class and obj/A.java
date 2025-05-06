import java.util.Scanner;

class Student {

    String name;
    int roll_no;
    int marks;

    void info() {

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

class A {

    public static void main(String[] args) {
        Student x = new Student();
        x.info();
        Student y = new Student();
        y.info();
        Student z = new Student();
        z.info();


    }
}