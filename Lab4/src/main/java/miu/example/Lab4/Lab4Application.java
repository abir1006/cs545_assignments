package miu.example.Lab4;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lab4Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Lab4Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("App is Running!");
	}
}
