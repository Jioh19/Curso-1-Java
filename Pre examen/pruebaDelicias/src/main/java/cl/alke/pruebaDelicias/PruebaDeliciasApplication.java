package cl.alke.pruebaDelicias;

import cl.alke.pruebaDelicias.controller.Principal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class PruebaDeliciasApplication implements CommandLineRunner {


	@Autowired
	Principal principal;

	public static void main(String[] args) {
		SpringApplication.run(PruebaDeliciasApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		principal.controlador();
	}
}
