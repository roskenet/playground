package de.roskenet;

import org.springframework.boot.actuate.autoconfigure.security.servlet.EndpointRequest;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {
 
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests() 
            .requestMatchers(EndpointRequest.toAnyEndpoint()).permitAll() //actuator
            .antMatchers(HttpMethod.OPTIONS).permitAll() // made by browsers 
            .mvcMatchers("/**").hasAuthority("SCOPE_email")
            .anyRequest().authenticated()
        .and()
        	.oauth2ResourceServer()
        	.jwt();
    }
}