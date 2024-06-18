package fms.fr.eval_fullstack_backend.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data

public class Hotel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String phone;
    private String address;
    private int starsNumber;
    private int roomsNumber;
    private double price;

    /**
     * The image URL of the hotel
     */
    private String img;

    private boolean active;

    /**
     * The ville associated with the hotel.
     */
    @ManyToOne
    @JoinColumn(name = "ville_id")
    private Ville ville;
}

