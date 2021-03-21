package com.example.springsecurityfacebooklogin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

@SpringBootApplication
@EnableOAuth2Sso //When you want to leverage OAuth for authentication
public class SpringsecurityFacebookLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringsecurityFacebookLoginApplication.class, args);
	}

}
