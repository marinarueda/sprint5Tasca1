package cat.itacademy.barcelonactiva.ruedaizquierdo.marina.s05.t01.n01.S05T01N01RuedaIzquierdoMarina;

import cat.itacademy.barcelonactiva.ruedaizquierdo.marina.s05.t01.n01.S05T01N01RuedaIzquierdoMarina.model.dto.SucursalDTO;
import cat.itacademy.barcelonactiva.ruedaizquierdo.marina.s05.t01.n01.S05T01N01RuedaIzquierdoMarina.model.services.SucursalService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class S05T01N01RuedaIzquierdoMarinaApplication implements CommandLineRunner {

	private final SucursalService sucursalService;

	public S05T01N01RuedaIzquierdoMarinaApplication(SucursalService sucursalService) {
		this.sucursalService = sucursalService;
	}

	public static void main(String[] args) {
		SpringApplication.run(S05T01N01RuedaIzquierdoMarinaApplication.class, args);
	}

	@Override
	public void run(String... args) {
		SucursalDTO sucursal1 = new SucursalDTO(1, "Sucursal norte", "España", "EU");
		SucursalDTO sucursal2 = new SucursalDTO(2, "Sucursal sur", "España", "Fora EU");

		sucursalService.saveSucursal(sucursal1);
		sucursalService.saveSucursal(sucursal2);
	}


}
