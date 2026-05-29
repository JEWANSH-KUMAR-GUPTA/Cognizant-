import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        char g = (m>=90)?'A':(m>=80)?'B':(m>=70)?'C':(m>=60)?'D':'F';
        System.out.println("Grade: " + g);
    }
}
