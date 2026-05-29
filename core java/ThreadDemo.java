class T extends Thread { public void run() { System.out.println("Thread"); } }
public class ThreadDemo {
    public static void main(String[] args) {
        new T().start();
    }
}
