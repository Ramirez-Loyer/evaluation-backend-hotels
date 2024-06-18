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

		hotelRepository.save(new Hotel(null, "Hotel Paradise", "0651409070", "3 rue des étoiles",5, 2, 300, "image.jpg", true, paris));
		hotelRepository.save(new Hotel(null, "Hotel Paradise", "0651409070", "3 rue des étoiles",5, 2, 300, "image.jpg", true, paris));
		hotelRepository.save(new Hotel(null, "Hotel Paradise", "0651409070", "3 rue des étoiles",5, 2, 300, "image.jpg", true, paris));
		hotelRepository.save(new Hotel(null, "Hotel Paradise", "0651409070", "3 rue des étoiles",5, 2, 300, "image.jpg", true, paris));
		hotelRepository.save(new Hotel(null, "Hotel Paradise", "0651409070", "3 rue des étoiles",5, 2, 300, "image.jpg", true, paris));
		hotelRepository.save(new Hotel(null, "Hotel Paradise", "0651409070", "3 rue des étoiles",5, 2, 300, "image.jpg", true, paris));

		hotelRepository.save(new Hotel(null, "Hotel Estrella", "0651409070", "5 avenida del paseo",3, 6, 100, "image.jpg", true, mexico));
		hotelRepository.save(new Hotel(null, "Hotel Estrella", "0651409070", "5 avenida del paseo",3, 6, 100, "image.jpg", true, mexico));
		hotelRepository.save(new Hotel(null, "Hotel Estrella", "0651409070", "5 avenida del paseo",3, 6, 100, "image.jpg", true, mexico));
		hotelRepository.save(new Hotel(null, "Hotel Estrella", "0651409070", "5 avenida del paseo",3, 6, 100, "image.jpg", true, mexico));
		hotelRepository.save(new Hotel(null, "Hotel Estrella", "0651409070", "5 avenida del paseo",3, 6, 100, "image.jpg", true, mexico));
		hotelRepository.save(new Hotel(null, "Hotel Estrella", "0651409070", "5 avenida del paseo",3, 6, 100, "image.jpg", true, mexico));

		hotelRepository.save(new Hotel(null, "Hotel Estrella", "0651409070", "5 avenida del paseo",3, 6, 100, "image.jpg", true, marrakech));
		hotelRepository.save(new Hotel(null, "Hotel Estrella", "0651409070", "5 avenida del paseo",3, 6, 100, "image.jpg", true, marrakech));
		hotelRepository.save(new Hotel(null, "Hotel Estrella", "0651409070", "5 avenida del paseo",3, 6, 100, "image.jpg", true, marrakech));
		hotelRepository.save(new Hotel(null, "Hotel Estrella", "0651409070", "5 avenida del paseo",3, 6, 100, "image.jpg", true, marrakech));
		hotelRepository.save(new Hotel(null, "Hotel Estrella", "0651409070", "5 avenida del paseo",3, 6, 100, "image.jpg", true, marrakech));
		hotelRepository.save(new Hotel(null, "Hotel Estrella", "0651409070", "5 avenida del paseo",3, 6, 100, "image.jpg", true, marrakech));

		hotelRepository.save(new Hotel(null, "Hotel Estrella", "0651409070", "5 avenida del paseo",3, 6, 100, "image.jpg", true, shanghai));
		hotelRepository.save(new Hotel(null, "Hotel Estrella", "0651409070", "5 avenida del paseo",3, 6, 100, "image.jpg", true, shanghai));
		hotelRepository.save(new Hotel(null, "Hotel Estrella", "0651409070", "5 avenida del paseo",3, 6, 100, "image.jpg", true, shanghai));
		hotelRepository.save(new Hotel(null, "Hotel Estrella", "0651409070", "5 avenida del paseo",3, 6, 100, "image.jpg", true, shanghai));
		hotelRepository.save(new Hotel(null, "Hotel Estrella", "0651409070", "5 avenida del paseo",3, 6, 100, "image.jpg", true, shanghai));
		hotelRepository.save(new Hotel(null, "Hotel Estrella", "0651409070", "5 avenida del paseo",3, 6, 100, "image.jpg", true, shanghai));

		hotelRepository.save(new Hotel(null, "Hotel Estrella", "0651409070", "5 avenida del paseo",3, 6, 100, "image.jpg", true, barcelone));
		hotelRepository.save(new Hotel(null, "Hotel Estrella", "0651409070", "5 avenida del paseo",3, 6, 100, "image.jpg", true, barcelone));
		hotelRepository.save(new Hotel(null, "Hotel Estrella", "0651409070", "5 avenida del paseo",3, 6, 100, "image.jpg", true, barcelone));
		hotelRepository.save(new Hotel(null, "Hotel Estrella", "0651409070", "5 avenida del paseo",3, 6, 100, "image.jpg", true, barcelone));
		hotelRepository.save(new Hotel(null, "Hotel Estrella", "0651409070", "5 avenida del paseo",3, 6, 100, "image.jpg", true, barcelone));
		hotelRepository.save(new Hotel(null, "Hotel Estrella", "0651409070", "5 avenida del paseo",3, 6, 100, "image.jpg", true, barcelone));

		hotelRepository.save(new Hotel(null, "Hotel Estrella", "0651409070", "5 avenida del paseo",3, 6, 100, "image.jpg", true, nagoya));
		hotelRepository.save(new Hotel(null, "Hotel Estrella", "0651409070", "5 avenida del paseo",3, 6, 100, "image.jpg", true, nagoya));
		hotelRepository.save(new Hotel(null, "Hotel Estrella", "0651409070", "5 avenida del paseo",3, 6, 100, "image.jpg", true, nagoya));
		hotelRepository.save(new Hotel(null, "Hotel Estrella", "0651409070", "5 avenida del paseo",3, 6, 100, "image.jpg", true, nagoya));
		hotelRepository.save(new Hotel(null, "Hotel Estrella", "0651409070", "5 avenida del paseo",3, 6, 100, "image.jpg", true, nagoya));
		hotelRepository.save(new Hotel(null, "Hotel Estrella", "0651409070", "5 avenida del paseo",3, 6, 100, "image.jpg", true, nagoya));

	}



}
