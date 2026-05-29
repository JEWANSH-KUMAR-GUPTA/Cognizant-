import java.util.Scanner;
public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int y = s.nextInt();
        if (_(y %% 4 == 0 && y %% 100 != 0)_ || (y %% 400 == 0))
            System.out.println(y + " is a leap year.");
        else System.out.println(y + " is not.");
    }
}
