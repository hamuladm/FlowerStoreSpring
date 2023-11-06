package ucu.apps.lab8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@ComponentScan({"lab8.src.main.java.ucu.apps.lab8.flowers.flower"})
@EntityScan("lab8.src.main.java.ucu.apps.lab8.flowers.flower")
public class Flowerstorelab72Application {

	public static void main(String[] args) {
		SpringApplication.run(Flowerstorelab72Application.class, args);
	}
}
