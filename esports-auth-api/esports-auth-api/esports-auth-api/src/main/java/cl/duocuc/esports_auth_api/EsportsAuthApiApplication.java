package cl.duocuc.esports_auth_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class EsportsAuthApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EsportsAuthApiApplication.class, args);
	}

}