import java.util.Scanner;
public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String c = s.nextLine().replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println(c.equals(new StringBuilder(c).reverse().toString()));
    }
}
