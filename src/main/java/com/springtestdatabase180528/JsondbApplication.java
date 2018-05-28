package com.springtestdatabase180528;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.springtestdatabase180528.domain.User;
import com.springtestdatabase180528.service.UserService;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@SpringBootApplication
public class JsondbApplication {

	public static void main(String[] args) {
		SpringApplication.run(JsondbApplication.class, args);
	}

	@Bean
	CommandLineRunner runner (UserService userService){
		return args -> {
			//read json and write to db,jackson
			ObjectMapper mapper = new ObjectMapper();
			TypeReference<List<User>> typeReference = new TypeReference<List<User>>(){};
			InputStream inputStream = TypeReference.class.getResourceAsStream("/json/users.json");
			try{
				List<User> users = mapper.readValue(inputStream,typeReference);
				userService.save(users);
				System.out.println("User Saved!");
			}catch (IOException e){
				System.out.println("Unable to save users: " + e.getMessage());
			}

		};
	}
}
