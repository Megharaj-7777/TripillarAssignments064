package assignment1;

import java.util.Scanner;

public class ProblemThree {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the radius : ");
        double radius=scanner.nextDouble();
        System.out.println("Area of the Circle is "+ Math.PI*radius*radius);
    }
}
