import java.util.Scanner;
public class StringReversal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(new StringBuilder(str).reverse().toString());
    }
}
