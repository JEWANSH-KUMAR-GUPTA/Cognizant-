import java.util.List;
public class StreamFilterDemo {
    public static void main(String[] args) {
        List.of(1,2,3,4).stream().filter(n->n%%2==0).forEach(System.out::println);
    }
}
