package module8;
public class ReverseWords {
    public static void main(String[] args) {
        String str = "Java is easy";

        String[] words = str.split(" ");

        for (String word : words) {
            StringBuilder sb = new StringBuilder(word);
            System.out.print(sb.reverse() + " ");
        }
    }
}
