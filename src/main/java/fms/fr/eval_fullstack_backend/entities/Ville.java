package fms.fr.eval_fullstack_backend.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Builder
public class Ville implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * The name of the ville.
     */
    private String name;

    /**
     * The collection of hotels associated with the ville.
     */
    @OneToMany(mappedBy = "ville")
    @ToString.Exclude
    @JsonIgnore
    private Collection<Hotel>hotels;

    /**
     * Constructs a new Ville with the specified name and collection of hotels.
     *
     * @param name      the name of the ville.
     * @param hotels the collection of hotels associated with the ville.
     */
    public Ville(String name, Collection<Hotel>hotels) {
        this.name = name;
        this.hotels = hotels;
    }
}
