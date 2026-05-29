public class TryCatchDemo {
    public static void main(String[] args) {
        try {
            int r = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Zero divide error");
        }
    }
}
