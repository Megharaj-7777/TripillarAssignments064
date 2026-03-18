package module9;
public class BinaryStrings {
    static void generate(int n, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        generate(n - 1, str + "0");
        generate(n - 1, str + "1");
    }

    public static void main(String[] args) {
        generate(3, "");
    }
}

