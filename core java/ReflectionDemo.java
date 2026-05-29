import java.lang.reflect.Method;
public class ReflectionDemo {
    public static void main(String[] args) throws Exception {
        Class<?> c = Class.forName("ReflectionDemo");
        Method[] m = c.getDeclaredMethods();
    }
}
