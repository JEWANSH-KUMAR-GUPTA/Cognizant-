class InvalidAgeException extends Exception { public InvalidAgeException(String m) { super(m); } }
public class CustomExceptionDemo {
    public static void main(String[] args) {
        try {
            throw new InvalidAgeException("Error");
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
