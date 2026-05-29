public class VirtualThreadDemo {
    public static void main(String[] args) throws Exception {
        Thread.startVirtualThread(()->{}).join();
    }
}
