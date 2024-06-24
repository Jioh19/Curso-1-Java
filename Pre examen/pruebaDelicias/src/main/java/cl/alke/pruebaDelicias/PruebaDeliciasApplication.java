package cl.alke.pruebaDelicias;

import cl.alke.pruebaDelicias.model.Stock;
import cl.alke.pruebaDelicias.model.StockId;
import cl.alke.pruebaDelicias.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class PruebaDeliciasApplication implements CommandLineRunner {

	@Autowired
	StockService service;

	public static void main(String[] args) {
		SpringApplication.run(PruebaDeliciasApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese sucursal, luego Id Prodcuto");
		String input = sc.nextLine();
		String[] inputs = input.split(" ");
		int idSucursal = Integer.parseInt(inputs[0]);
		int idProducto = Integer.parseInt(inputs[1]);


		int stock = service.getStock(idProducto, idSucursal);
		System.out.println(stock);
	}
}
