package java11example;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class VarExample {

    public static void main(String[] args) {
        VarExample.showHttpClientUsage();
    }
    
    
    public static void showVarUsage() {
        var thisIsAVar = "This is a String";
        System.out.println(thisIsAVar);
    }
    
    public static void showHttpClientUsage() {
        HttpClient client = HttpClient.newHttpClient();
        
        HttpRequest request = HttpRequest.newBuilder()
              .uri(URI.create("http://openjdk.java.net/"))
              .build();

        client.sendAsync(request, BodyHandlers.ofString())
              .thenApply(HttpResponse::body)
              .thenAccept(System.out::println)
              .join();   
    }
}
