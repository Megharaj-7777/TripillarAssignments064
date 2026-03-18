package Module4;
public class StringTypes {
    public static void main(String args[]) {

        String s = "Hello";

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");

        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(" Java");

        System.out.println("String: " + s);
        System.out.println("StringBuilder: " + sb);
        System.out.println("StringBuffer: " + sbf);
    }
}