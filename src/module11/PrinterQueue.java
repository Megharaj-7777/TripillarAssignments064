package module11;
import java.util.LinkedList;
import java.util.Queue;

public class PrinterQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("File1");
        queue.add("File2");
        queue.add("File3");

        while (!queue.isEmpty()) {
            System.out.println("Printing: " + queue.poll());
        }
    }
}
