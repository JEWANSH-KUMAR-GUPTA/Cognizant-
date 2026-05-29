import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame {
    public static void main(String[] args) {
        int t = new Random().nextInt(100)+1;
        Scanner s = new Scanner(System.in);
        int g = 0;
        while(g!=t){
            g=s.nextInt();
            if(g>t) System.out.println("Too high");
            else if(g<t) System.out.println("Too low");
        }
        System.out.println("Correct");
    }
}
