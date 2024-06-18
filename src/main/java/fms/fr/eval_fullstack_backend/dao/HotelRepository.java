package fms.fr.eval_fullstack_backend.dao;

import fms.fr.eval_fullstack_backend.entities.Hotel;
import fms.fr.eval_fullstack_backend.entities.Ville;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Repository interface for Hotel entities.
 * Provides CRUD operations and other query methods for Hotel objects.
 */
@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {

    /**
     * Retrieves a list of hotels by ville.
     *
     * @param ville the ville to filter hotels by.
     * @return a list of hotels belonging to the specified ville.
     */
    public List<Hotel> findByVille(Ville ville);
}
