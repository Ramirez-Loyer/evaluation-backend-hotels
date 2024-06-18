package fms.fr.eval_fullstack_backend.business;

import fms.fr.eval_fullstack_backend.dao.HotelRepository;
import fms.fr.eval_fullstack_backend.dao.VilleRepository;
import fms.fr.eval_fullstack_backend.entities.Hotel;
import fms.fr.eval_fullstack_backend.entities.Ville;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Service implementation for business logic.
 */
@Service
public class IBusinessImpl implements IBusiness {

    @Autowired()
    HotelRepository hotelRepository;

    @Autowired
    VilleRepository villeRepository;


    /**
     * Retrieves all hotels.
     *
     * @return a list of all hotels.
     */
    @Override
    public List<Hotel> getHotels() {
        return hotelRepository.findAll();
    }

    /**
     * Retrieves all hotels by ville.
     *
     * @param idVille the ID of the category.
     * @return a list of hotels in the specified ville.
     */
    @Override
    public List<Hotel> getHotelsByVille(Long idVille) {
        Ville ville = villeRepository.findById(idVille).orElse(null);
        return hotelRepository.findByVille(ville);
    }

    /**
     * Retrieves a hotel by its ID.
     *
     * @param idHotel the ID of the training.
     * @return an Optional containing the hotel if found, or empty if not found.
     */
    @Override
    public Optional<Hotel> getHotelById(Long idHotel) {
        return hotelRepository.findById(idHotel);
    }

    /**
     * Saves a hotel.
     *
     * @param hotel the hotel to save.
     * @return the saved hotel.
     */
    @Override
    public Hotel saveHotel(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    /**
     * Deletes a hotel by its ID.
     *
     * @param idHotel the ID of the hotel to delete.
     */
    @Override
    public void deleteHotel(Long idHotel) {
        hotelRepository.deleteById(idHotel);
    }

    /**
     * Retrieves all villes.
     *
     * @return a list of all villes.
     */
    //@Override
    //public List<villeDTO> getCategories() {
        //return villeRepository.findAll()
                //.stream()
                //.map(category -> VilleMapper.mapToDto(category))
                //.collect(Collectors.toList());
    //}
}

