public class PatternMatchingSwitch {
    public static void main(String[] args) {
        Object o = "Hello";
        switch(o) {
            case Integer i -> System.out.println("Int");
            case String s -> System.out.println("String");
            default -> {}
        }
    }
}
