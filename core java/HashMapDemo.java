import java.util.HashMap;
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> m = new HashMap<>();
        m.put(1, "Alice");
        System.out.println(m.get(1));
    }
}
