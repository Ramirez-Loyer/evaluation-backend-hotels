package fms.fr.eval_fullstack_backend.dao;

import fms.fr.eval_fullstack_backend.entities.Ville;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for Ville entities.
 * Provides CRUD operations and other query methods for Category objects.
 */
@Repository
public interface VilleRepository extends JpaRepository<Ville, Long> {
}