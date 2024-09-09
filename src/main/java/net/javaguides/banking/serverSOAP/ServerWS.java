package net.javaguides.banking.serverSOAP;

import jakarta.xml.ws.Endpoint;
import org.springframework.stereotype.Component;


@Component
public class ServerWS {
    public static void main(String[] args) {
        String url = "http://localhost:8080/";
        Endpoint.publish(url, new AccountSOAP());
        System.out.println("Server Started"+ url);
    }
}
