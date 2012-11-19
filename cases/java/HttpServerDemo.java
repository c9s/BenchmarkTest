import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
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
    InetSocketAddress addr = new InetSocketAddress(8080);
    HttpServer server = HttpServer.create(addr, 0);

    server.createContext("/", new MyHandler());
    // server.setExecutor(Executors.newCachedThreadPool());
    server.setExecutor(null);
    server.start();
    System.out.println("Server is listening on port 8080" );
  }
}

class MyHandler implements HttpHandler {
  public void handle(HttpExchange exchange) throws IOException {
    String requestMethod = exchange.getRequestMethod();
    // if (requestMethod.equalsIgnoreCase("GET")) {
      String response = "Hello World";
      // responseHeaders.set("Content-Type", "text/html");
      Headers responseHeaders = exchange.getResponseHeaders();
      responseHeaders.set("Connection", "close");
      // responseHeaders.set("Content-Length", Integer.toString(response.length()) );
      exchange.sendResponseHeaders(200, response.length());

      OutputStream responseBody = exchange.getResponseBody();
      responseBody.write(response.getBytes());
      // responseBody.close();
      exchange.close();

      // Headers requestHeaders = exchange.getRequestHeaders();
      // Set<String> keySet = requestHeaders.keySet();
      // Iterator<String> iter = keySet.iterator();
      // while (iter.hasNext()) {
      //   String key = iter.next();
      //   List values = requestHeaders.get(key);
      //   String s = key + " = " + values.toString() + "\n";
      //   responseBody.write(s.getBytes());
      // }
      // responseBody.close();
    // }
  }
}
