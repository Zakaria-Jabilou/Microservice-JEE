package com.example.cont.doa;

import com.example.cont.enums.Statut;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Ticket {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(length = 16, nullable = false, unique = true)
    private String ref;
    private double price;
    @Enumerated(EnumType.STRING)
    private Statut statut;
    @ManyToOne
    private Match match;
}
