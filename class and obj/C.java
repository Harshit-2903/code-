import java.util.Scanner;

class Student2 {

    String name;
    int roll_no;
    int marks;

    {
        
    Scanner inp = new Scanner(System.in);

    System.out.print("Enter student name : ");
    name = inp.nextLine();

    System.out.print("Enter roll number : ");
    roll_no = inp.nextInt();

    System.out.print("Enter marks : ");
    marks = inp.nextInt();

    }
    
    Student2() {

        display();

    }

    private void display() {

        System.out.println(name);
        System.out.println(roll_no);
        System.out.println(marks);

    }

}

class C {

    public static void main(String[] args) {
        Student2 x = new Student2();
     
        Student2 y = new Student2();
     
        Student2 t = new Student2();
      


    }
}