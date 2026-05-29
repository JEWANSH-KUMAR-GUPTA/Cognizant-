import java.net.URI;
import java.net.http.*;
public class HttpClientDemo {
    public static void main(String[] args) throws Exception {
        HttpClient.newHttpClient().send(HttpRequest.newBuilder().uri(URI.create("https://api.github.com/")).GET().build(), HttpResponse.BodyHandlers.ofString());
    }
}
