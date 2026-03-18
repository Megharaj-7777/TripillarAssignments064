package assignment1.partThree;
public class PNZ {

    public static void checkNumber(int num) {
        if (num > 0)
            System.out.println("Positive");
        else if (num < 0)
            System.out.println("Negative");
        else
            System.out.println("Zero");
    }

    public static void main(String[] args) {
        checkNumber(3);
    }
}