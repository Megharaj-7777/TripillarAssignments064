package Module5;
import java.io.*;

public class ThrowsDemo {
    static void check() throws IOException {
        throw new IOException("Input Output Exception");
    }

    public static void main(String args[]) {
        try {
            check();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}