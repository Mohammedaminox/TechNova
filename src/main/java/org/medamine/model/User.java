package org.medamine.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nom;
    private String prenom;
    private String pieceIdentification;
    private String nationalite;
    private LocalDate dateInscription;  // Changed to LocalDate
    private LocalDate dateExpiration;    // Changed to LocalDate
}
