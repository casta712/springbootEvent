package com.event.app.springBootEvent;

import com.event.app.springBootEvent.event.publisher.UserPublisher;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootEventApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEventApplication.class, args);
	}


	@Bean
	CommandLineRunner init(UserPublisher userPublisher){
		return args -> {
			userPublisher.publishUserRegisteredEvent();
		};
	}

}
