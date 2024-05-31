package miu.example.Lab3;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lab3Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Lab3Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("App is Running!");
	}
}
