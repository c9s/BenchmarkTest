import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.HttpURLConnection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;

import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

public class HttpServerDemo {
  public static void main(String[] args) throws IOException {
    int port = 8000;
    InetSocketAddress addr = new InetSocketAddress(port);
    HttpServer server = HttpServer.create(addr, 0);

    server.createContext("/", new MyHandler());
    server.setExecutor(Executors.newCachedThreadPool());
    // server.setExecutor(null);
    server.start();
    System.out.println("Server is listening on port " + port );
  }
}

class MyHandler implements HttpHandler {
  @Override
  public void handle(HttpExchange t) throws IOException {
      String response = "Hello World";
      Headers responseHeaders = t.getResponseHeaders();
      responseHeaders.set("Content-Type", "text/plain");
      // responseHeaders.set("Connection", "close");
      // responseHeaders.set("Content-Length", Integer.toString(response.length()) );
      t.sendResponseHeaders(HttpURLConnection.HTTP_OK, response.length());
      t.getResponseBody().write(response.getBytes());
      t.close();
  }
}
