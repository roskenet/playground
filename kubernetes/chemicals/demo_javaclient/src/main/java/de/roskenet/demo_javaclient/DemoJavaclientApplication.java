package de.roskenet.demo_javaclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.client.OAuth2AuthorizationContext;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientManager;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientProvider;
import org.springframework.security.oauth2.client.endpoint.DefaultClientCredentialsTokenResponseClient;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.core.endpoint.OAuth2AccessTokenResponse;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DemoJavaclientApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DemoJavaclientApplication.class, args);
    }

    @Autowired
    private DefaultClientCredentialsTokenResponseClient client;

    @Autowired
    private ClientRegistrationRepository repository;

    @Autowired
    private OAuth2AuthorizedClientManager manager;

//    @Autowired
//    private OAuth2AuthorizedClient authorizedClient;

//    @Autowired
//    private OAuth2AuthorizedClientProvider provider;

//    @Autowired
//    private OAuth2AuthorizationContext context;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello World!");

        var hydrogen = repository.findByRegistrationId("hydrogen");

//        provider.authorize(context);

//        client.delete("http://localhost:9191/test");
//        var tokenResponse = client.getTokenResponse(repository.findByRegistrationId("hydrogen"));

    }
}
