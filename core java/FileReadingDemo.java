import java.io.BufferedReader;
java.io.FileReader;
public class FileReadingDemo {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new FileReader("output.txt"));
        System.out.println(r.readLine());
        r.close();
    }
}
