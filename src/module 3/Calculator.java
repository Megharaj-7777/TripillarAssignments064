package assignment1.partThree;
class Calculator {

    // Method to add two numbers
    int add(int a, int b) {
        return a + b;
    }

    // Method to subtract two numbers
    int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int sum = calc.add(10, 5);
        int difference = calc.subtract(10, 5);

        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + difference);
    }
}
