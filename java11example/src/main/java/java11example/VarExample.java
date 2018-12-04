package java11example;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class VarExample {

    public static void showVarUsage() {
        var thisIsAVar = "This is a String";
        System.out.println(thisIsAVar);
    }
    
    public static void showHttpClientUsage() {
        HttpClient client = HttpClient.newHttpClient();
        
        HttpRequest request = HttpRequest.newBuilder()
              .uri(URI.create("http://openjdk.java.net/"))
              .build();

        client.sendAsync(request, "blubber")
              .thenApply(HttpResponse::body)
              .thenAccept(System.out::println)
              .join();   
    }
}
