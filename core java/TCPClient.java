import java.net.*;
public class TCPClient {
    public static void main(String[] args) throws Exception {
        new Socket("localhost", 5000).close();
    }
}
