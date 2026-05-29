import java.util.ArrayList;
import java.util.List;
public class LambdaSortDemo {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>(List.of("B","A"));
        l.sort((s1,s2)->s1.compareTo(s2));
        System.out.println(l);
    }
}
