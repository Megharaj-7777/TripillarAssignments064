package Module5;
public class AgeCheck {
    public static void main(String args[]) {
        int age = 19;

        if(age < 18) {
            throw new ArithmeticException("Not eligible");
        } else {
            System.out.println("Eligible");
        }
    }
}