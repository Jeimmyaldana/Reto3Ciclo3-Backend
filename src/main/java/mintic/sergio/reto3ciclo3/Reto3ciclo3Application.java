package mintic.sergio.reto3ciclo3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude={SecurityAutoConfiguration.class})
public class Reto3ciclo3Application {

	public static void main(String[] args) {
		SpringApplication.run(Reto3ciclo3Application.class, args);
	}

}
