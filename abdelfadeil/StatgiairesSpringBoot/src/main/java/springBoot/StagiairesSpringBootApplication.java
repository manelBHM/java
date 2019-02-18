package springBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class StagiairesSpringBootApplication {

	
	@Autowired
	public static void main(String[] args) {
		SpringApplication.run(StagiairesSpringBootApplication.class, args);
	}
	

}
