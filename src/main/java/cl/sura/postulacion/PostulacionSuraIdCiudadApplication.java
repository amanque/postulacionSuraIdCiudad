package cl.sura.postulacion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class PostulacionSuraIdCiudadApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostulacionSuraIdCiudadApplication.class, args);
	}

	@Bean
	public RestTemplate getRestTemplate() {return new RestTemplate();}

}
