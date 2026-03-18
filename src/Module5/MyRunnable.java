package Module5;
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Runnable thread running");
    }

    public static void main(String args[]) {
        MyRunnable r = new MyRunnable();
        Thread t = new Thread(r);
        t.start();
    }
}