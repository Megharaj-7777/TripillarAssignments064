package Module4;
public class GarbageDemo {
    public void finalize() {
        System.out.println("Garbage collected");
    }

    public static void main(String args[]) {
        GarbageDemo obj = new GarbageDemo();
        obj = null;
        System.gc();
    }
}