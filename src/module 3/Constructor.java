package assignment1.partThree;
class Constructor {

    String name;
    int age;

    // Constructor
    Constructor(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Constructor s1 = new Constructor("Megharaj", 21);
        s1.display();
    }
}
