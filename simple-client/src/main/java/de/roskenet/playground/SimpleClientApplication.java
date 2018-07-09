package de.roskenet.playground;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.security.oauth2.client.DefaultOAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.token.grant.client.ClientCredentialsResourceDetails;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;

@SpringBootApplication
//@EnableResourceServer
@EnableOAuth2Client
//@EnableOAuth2Sso
public class SimpleClientApplication {
    
    @Bean
    public OAuth2RestTemplate restTemplate() {
        ClientCredentialsResourceDetails resourceDetails = new ClientCredentialsResourceDetails();
        resourceDetails.setAccessTokenUri("http://localhost:8080/auth/realms/demo/protocol/openid-connect/token");
        resourceDetails.setClientId("simple-client");
        resourceDetails.setClientSecret("c0dba145-1cce-4775-be90-5909094bb361");
        resourceDetails.setGrantType("client_credentials");
        resourceDetails.setScope(Arrays.asList("profile", "blubber"));

        
        DefaultOAuth2ClientContext clientContext = new DefaultOAuth2ClientContext();

        OAuth2RestTemplate restTemplate = new OAuth2RestTemplate(resourceDetails, clientContext);
        restTemplate.setMessageConverters(Arrays.asList(new MappingJackson2HttpMessageConverter()));
        
        return restTemplate;
    }
    
	public static void main(String[] args) {
		SpringApplication.run(SimpleClientApplication.class, args);
	}
}
