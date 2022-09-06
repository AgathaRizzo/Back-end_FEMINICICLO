package ifsp.edu.br.feminicicloapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.RestController;

import ifsp.edu.br.feminicicloapi.repository.FeedbackRepository;

@SpringBootApplication
@RestController

public class FeminicicloapiApplication {
	
	public static void main(String[] args) {
		FeedbackRepository.init();
		SpringApplication.run(FeminicicloapiApplication.class, args);
	}

}
