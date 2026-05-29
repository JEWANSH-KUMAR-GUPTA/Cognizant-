import java.io.FileWriter;
public class FileWritingDemo {
    public static void main(String[] args) throws Exception {
        FileWriter w = new FileWriter("output.txt");
        w.write("Hello");
        w.close();
    }
}
