package fms.fr.eval_fullstack_backend.web;

import fms.fr.eval_fullstack_backend.business.IBusinessImpl;
import fms.fr.eval_fullstack_backend.dao.VilleRepository;
import fms.fr.eval_fullstack_backend.entities.Hotel;
import fms.fr.eval_fullstack_backend.exception.RecordNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Objects;


/**
 * Controller class for handling training-related requests.
 */
@CrossOrigin("\"http://localhost:4200\"")
@RestController
public class HotelController {

    @Autowired
    IBusinessImpl iBusiness;

    @Autowired
    VilleRepository villeRepository;

   //@PostMapping("/ville")
   //public VilleDTO add(@RequestBody VilleDTO entity) {
   //return iBusiness.add;
   //}

    /**
     * Endpoint for retrieving all hotels.
     *
     * @return the list of all hotels.
     */
    @GetMapping("/hotels")
    public List<Hotel> allHotels() {
        return iBusiness.getHotels();
    }


    @PostMapping("/hotels")
    public Hotel saveHotel(@RequestBody Hotel hotel){
        return iBusiness.saveHotel(hotel);
    }

    /**
     * Endpoint for saving a hotel.
     *
     * @param hotel the hotel to save.
     * @return ResponseEntity containing the saved training.
     */

    /*@PostMapping("/hotels")
    public ResponseEntity<Hotel> saveHotel(@RequestBody Hotel hotel) {
        Hotel hotel1 = iBusiness.saveHotel(hotel);
        if (Objects.isNull(hotel1)) {
            return ResponseEntity.noContent().build();
        }
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(hotel1.getId())
                .toUri();
        return ResponseEntity.created(location).body(hotel1);
    }*/

    /**
     * Endpoint for deleting a hotel by ID.
     *
     * @param id the ID of the hotel to delete.
     */
    @DeleteMapping("/hotels/{id}")
    public void deleteHotel(@PathVariable("id") Long id) {
        System.out.println("Suppression ok");
        iBusiness.deleteHotel(id);
    }

    /**
     * Endpoint for retrieving a hotel by ID.
     *
     * @param id the ID of the hotel to retrieve.
     * @return the retrieved hotel.
     * @throws RecordNotFoundException if the training with the given ID does not exist.
     */
    @GetMapping("/hotel/{id}")
    public Hotel getHotelById(@PathVariable("id") Long id) {
        return iBusiness.getHotelById(id)
                .orElseThrow(() -> new RecordNotFoundException("Id de Hotel " + id + " n'existe pas"));
    }

    /**
     * Endpoint for retrieving hotels by ville ID.
     *
     * @param id the ID of the ville.
     * @return the list of hotels belonging to the specified ville.
     */
    @GetMapping("/hotels/ville/{id}")
    public List<Hotel> getHotelByVille(@PathVariable("id") Long id) {
        return iBusiness.getHotelsByVille(id);
    }

    /**
     * Endpoint for retrieving all villes.
     *
     * @return the list of all villes.
     */
    //@GetMapping("/villes")
    //public List<VilleDTO> getAllVilles() {
       // return iBusiness.getVilles();
   // }

}
