//1.Modelo o entidad
//2.Interface
//3.Repositorio
//4.Servicios
//5.Controlador o Web




package rETO3.rETO3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan("rETO3.rETO3")
@SpringBootApplication
public class rETO3Application {

	public static void main(String[] args) {
		SpringApplication.run(rETO3Application.class, args);
	}

}
