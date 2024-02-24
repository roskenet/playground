package de.roskenet.demo_resource

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.web.SecurityFilterChain

import org.springframework.security.config.annotation.web.invoke
import org.springframework.security.oauth2.server.resource.introspection.OpaqueTokenIntrospector
import org.springframework.security.oauth2.server.resource.introspection.SpringOpaqueTokenIntrospector

@Configuration
@EnableWebSecurity
@EnableMethodSecurity(prePostEnabled = true)
class SecurityConfig {

	@Bean
	fun securityFilterChain(http: HttpSecurity): SecurityFilterChain {
		http {
			authorizeHttpRequests {
				authorize(anyRequest, authenticated)
			}
			oauth2ResourceServer {
				opaqueToken { }
			}
		}

		return http.build()
	}

	@Bean
	fun opaqueTokenIntrospector(): OpaqueTokenIntrospector {
		return SpringOpaqueTokenIntrospector(
			"http://keycloak.192-168-49-2.nip.io/realms/chemicals/protocol/openid-connect/token/introspect", "oxygen", "U74inMN8xWQxgOBv5emkh62EGJZabikh"
		)
	}

}