package comm.sample.mainapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainClass implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MainClass.class, args);
	}

	public void run(String... args) throws Exception {

		System.out.println("boot is up");

	}

}
