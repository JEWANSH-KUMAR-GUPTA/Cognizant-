import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double n1 = s.nextDouble();
        System.out.print("Enter second number: ");
        double n2 = s.nextDouble();
        System.out.print("Choose operation (+, -, *, /): ");
        char op = s.next().charAt(0);
        double r;
        switch(op) {
            case '+' -> r = n1 + n2;
            case '-' -> r = n1 - n2;
            case '*' -> r = n1 * n2;
            case '/' -> r = n1 / n2;
            default -> { System.out.println("Invalid"); return; }
        }
        System.out.println("Result: " + r);
    }
}
