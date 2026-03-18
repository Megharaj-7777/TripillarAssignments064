package assignment1.partThree;
class Student {
    String name;
    int marks;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

public class StudentDetails {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Ravi";
        s1.marks = 85;

        s1.display();
    }
}
