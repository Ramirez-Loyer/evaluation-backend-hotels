package fms.fr.eval_fullstack_backend;

import fms.fr.eval_fullstack_backend.dao.HotelRepository;
import fms.fr.eval_fullstack_backend.dao.VilleRepository;
import fms.fr.eval_fullstack_backend.entities.Hotel;
import fms.fr.eval_fullstack_backend.entities.Ville;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class EvalFullstackBackendApplication implements CommandLineRunner {
	@Value("${app.home}")
	private String userHome;

	@Autowired
	private HotelRepository hotelRepository;

	@Autowired
	private VilleRepository villeRepository;

	/**
	 * The entry point of the application.
	 *
	 * @param args the command line arguments.
	 */
	public static void main(String[] args) {
		SpringApplication.run(EvalFullstackBackendApplication.class, args);
	}

	/**
	 * Run method implemented from CommandLineRunner interface.
	 *
	 * @param args the command line arguments.
	 * @throws Exception if an error occurs.
	 */
	@Override
	public void run(String... args) throws Exception {
		generatedData();
	}

	/**
	 * Method to generate sample data.
	 */
	public void generatedData() {

		List<Hotel> hotelsList = new ArrayList<>();

		Ville paris = new Ville("Paris", hotelsList);
		Ville mexico = new Ville("Mexico", hotelsList);
		Ville marrakech = new Ville("Marrakech", hotelsList);
		Ville shanghai = new Ville("Shanghai", hotelsList);
		Ville barcelone = new Ville("Barcelone", hotelsList);
		Ville nagoya = new Ville("Nagoya", hotelsList);

		villeRepository.save(paris);
		villeRepository.save(mexico);
		villeRepository.save(marrakech);
		villeRepository.save(shanghai);
		villeRepository.save(barcelone);
		villeRepository.save(nagoya);

		hotelRepository.save(new Hotel(null, "Hotel Paradis", "0651409070", "23 rue du paradis",5, 2, 400, "bedroom2.jpg", true, paris));
		hotelRepository.save(new Hotel(null, "Hotel Etoile", "0651409070", "44 rue des étoiles",4, 2, 300, "bedroom2.jpg", true, paris));
		hotelRepository.save(new Hotel(null, "Hotel de la Gare", "0651409070", "5 rue de la Gare",3, 2, 200, "bedroom2.jpg", true, paris));
		hotelRepository.save(new Hotel(null, "Hotel Luna", "0651409070", "66 avenue de la Lune",2, 2, 100, "bedroom2.jpg", true, paris));
		hotelRepository.save(new Hotel(null, "Hotel Nation", "0651409070", "87 boulevard de la Nation",3, 2, 200, "bedroom2.jpg", true, paris));
		hotelRepository.save(new Hotel(null, "Hotel D'Europe", "0651409070", "98 impasse d'Europe",4, 2, 300, "bedroom2.jpg", true, paris));

		hotelRepository.save(new Hotel(null, "Casa Sabina", "0651409070", "12 República de Brasil",3, 2, 200, "image.jpg", true, mexico));
		hotelRepository.save(new Hotel(null, "Hotel Catedral", "0651409070", "Donceles 95",5, 6, 400, "image.jpg", true, mexico));
		hotelRepository.save(new Hotel(null, "Hotel Regina", "0651409070", "Regina 58, Centro",4, 6, 300, "image.jpg", true, mexico));
		hotelRepository.save(new Hotel(null, "Casa Luna", "0651409070", "115 avenida de la luna",3, 6, 200, "image.jpg", true, mexico));
		hotelRepository.save(new Hotel(null, "Hotel de la Nación", "0651409070", "117 boulevard de la Nación",2, 6, 100, "image.jpg", true, mexico));
		hotelRepository.save(new Hotel(null, "Hotel de Europa", "0651409070", "15 avenida de Europa",3, 6, 200, "image.jpg", true, mexico));

		hotelRepository.save(new Hotel(null, "Hotel Racine", "0651409070", "Place Jamaâ El Fna",4, 6, 100, "image.jpg", true, marrakech));
		hotelRepository.save(new Hotel(null, "Hotel El Dar", "0651409070", "15 Jardin Secret",2, 6, 100, "image.jpg", true, marrakech));
		hotelRepository.save(new Hotel(null, "Riad Ekla Hotel", "0651409070", "Place Jamaâ El Fna",3, 6, 100, "image.jpg", true, marrakech));
		hotelRepository.save(new Hotel(null, "Riad Flamme D'Orient", "0651409070", "Place Jamaâ El Fna",4, 6, 100, "image.jpg", true, marrakech));
		hotelRepository.save(new Hotel(null, "Hotel Le Jardin Secret", "0651409070", "Centre de Marrakech",3, 6, 100, "image.jpg", true, marrakech));
		hotelRepository.save(new Hotel(null, "Hotel Central", "0651409070", "Quartier de Gueliz ",4, 6, 100, "image.jpg", true, marrakech));

		hotelRepository.save(new Hotel(null, "Jin Jiang Hotel", "0651409070", "108 West Nanjing Road",3, 6, 200, "image.jpg", true, shanghai));
		hotelRepository.save(new Hotel(null, "Radisson Blu", "0651409070", "88 West Nanjing Road",4, 6, 300, "image.jpg", true, shanghai));
		hotelRepository.save(new Hotel(null, "Hotel Shangai Fish", "0651409070", "639 Middle Henan Road",2, 6, 100, "image.jpg", true, shanghai));
		hotelRepository.save(new Hotel(null, "Central Hotel Shangai", "0651409070", "55 Jiujiang Road",2, 6, 100, "image.jpg", true, shanghai));
		hotelRepository.save(new Hotel(null, "Jianguo Hotel", "0651409070", "439 North Cao Xi Road",3, 6, 200, "image.jpg", true, shanghai));
		hotelRepository.save(new Hotel(null, "Hotel Conrad Shangai", "0651409070", "89 East NanJing Road",3, 6, 200, "image.jpg", true, shanghai));

		hotelRepository.save(new Hotel(null, "Hostal Orleans", "0651409070", "Avenida Marqués de la Argentera",2, 6, 100, "image.jpg", true, barcelone));
		hotelRepository.save(new Hotel(null, "Ofelias Hotel", "0651409070", "Llançà 24, L'Eixample, ",4, 6, 300, "image.jpg", true, barcelone));
		hotelRepository.save(new Hotel(null, "Pensión Bertolín", "0651409070", " 116 Carrer del Carme",3, 6, 200, "image.jpg", true, barcelone));
		hotelRepository.save(new Hotel(null, "Hostal Gracia", "0651409070", " 26 Carrer Gran de Gràcia",3, 6, 200, "image.jpg", true, barcelone));
		hotelRepository.save(new Hotel(null, "Hotel La Rambla", "0651409070", "La Rambla 34",4, 6, 300, "image.jpg", true, barcelone));
		hotelRepository.save(new Hotel(null, "Hotel La Sagrada Familia", "0651409070", "Roger de Flor 215",3, 6, 200, "image.jpg", true, barcelone));

		hotelRepository.save(new Hotel(null, "Hotel Estrella", "0651409070", "5 avenida del paseo",3, 6, 100, "image.jpg", true, nagoya));
		hotelRepository.save(new Hotel(null, "Hotel Estrella", "0651409070", "5 avenida del paseo",3, 6, 100, "image.jpg", true, nagoya));
		hotelRepository.save(new Hotel(null, "Hotel Estrella", "0651409070", "5 avenida del paseo",3, 6, 100, "image.jpg", true, nagoya));
		hotelRepository.save(new Hotel(null, "Hotel Estrella", "0651409070", "5 avenida del paseo",3, 6, 100, "image.jpg", true, nagoya));
		hotelRepository.save(new Hotel(null, "Hotel Estrella", "0651409070", "5 avenida del paseo",3, 6, 100, "image.jpg", true, nagoya));
		hotelRepository.save(new Hotel(null, "Hotel Estrella", "0651409070", "5 avenida del paseo",3, 6, 100, "image.jpg", true, nagoya));

	}



}
