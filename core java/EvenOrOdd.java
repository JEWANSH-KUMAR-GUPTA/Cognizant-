import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = s.nextInt();
        if (n %% 2 == 0) System.out.println(n + " is even.");
        else System.out.println(n + " is odd.");
    }
}
