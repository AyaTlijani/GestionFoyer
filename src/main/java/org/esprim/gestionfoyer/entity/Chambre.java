package org.esprim.gestionfoyer.entity;

import jakarta.persistence.*;

@Entity
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long idChambre;
    private Long NumChamre;
    @Enumerated(EnumType.STRING)
    private TypeChambre typeC;
}
