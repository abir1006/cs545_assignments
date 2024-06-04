package miu.example.Lab5;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lab5Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Lab5Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("App is Running!");
	}
}
