package Module5;
class TryCatchFinally {
    public static void main(String args[]) {
        try {
            int a = 10/0;
        } catch (ArithmeticException e) {
            System.out.println("Exception occurred");
        } finally {
            System.out.println("Finally block executed");
        }
    }
}