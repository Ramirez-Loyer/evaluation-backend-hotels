package fms.fr.eval_fullstack_backend.business;


import fms.fr.eval_fullstack_backend.entities.Hotel;
import java.util.List;
import java.util.Optional;

/**
 * Business interface for handling various operations related to trainings, categories, customers, orders, and order items.
 */
public interface IBusiness {

    /**
     * Retrieves all hotels.
     *
     * @return a list of all hotels.
     */
    List<Hotel> getHotels();

    /**
     * Retrieves all hotels by ville.
     *
     * @param idVille the ID of the ville.
     * @return a list of hotels in the specified ville.
     */
    List<Hotel> getHotelsByVille(Long idVille);

    /**
     * Retrieves a hotel by its ID.
     *
     * @param idHotel the ID of the training.
     * @return an Optional containing the training if found, or empty if not found.
     */
    Optional<Hotel> getHotelById(Long idHotel);

    /**
     * Saves a hotel.
     *
     * @param hotel the hotel to save.
     * @return the saved hotel.
     */
    Hotel saveHotel(Hotel hotel);

    /**
     * Deletes a hotel by its ID.
     *
     * @param idHotel the ID of the hotel to delete.
     */
    void deleteHotel(Long idHotel);

    /**
     * Retrieves all villes.
     *
     * @return a list of all villes.
     */
    //List<VillesDTO> getVilles();

}
