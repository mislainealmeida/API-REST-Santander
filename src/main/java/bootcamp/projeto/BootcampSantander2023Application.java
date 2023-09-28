package bootcamp.projeto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;


@SpringBootApplication
public class BootcampSantander2023Application {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(BootcampSantander2023Application.class);
		app.setDefaultProperties(Collections.singletonMap("server.port", "8081"));
		app.run(args);
	}

}
