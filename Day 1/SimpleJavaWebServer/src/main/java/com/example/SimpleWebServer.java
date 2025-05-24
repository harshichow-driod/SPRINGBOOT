package com.example;

import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class SimpleWebServer {

    public static void main(String[] args) throws IOException {
        // 1. Create HttpServer on port 8000
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);

        // 2. Set up a context for root path
        server.createContext("/", new RootHandler());

        // 3. Start server
        server.setExecutor(null); // Use default executor
        server.start();
        System.out.println("Server started at http://localhost:8000/");
    }

    // Handler for root path
    static class RootHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            String response = "<h1>Hello! This is a simple Java Web Server</h1>";
            exchange.sendResponseHeaders(200, response.length());
            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }
    }
}
