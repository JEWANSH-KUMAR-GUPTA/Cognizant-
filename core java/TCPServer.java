import java.net.*;
public class TCPServer {
    public static void main(String[] args) throws Exception {
        ServerSocket s = new ServerSocket(5000);
        s.accept().close();
        s.close();
    }
}
