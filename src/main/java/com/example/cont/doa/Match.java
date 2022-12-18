package com.example.cont.doa;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Match {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(unique = true)
    private String ref;
    @Temporal(TemporalType.DATE)

    private Date date;
    private String lieu;
    private String fisrtequipe;
    private String secondequipe;

    @OneToMany(mappedBy = "match",fetch = FetchType.LAZY)
    private Collection<Ticket> ticket;

    public Match(Integer id, String ref, Date date, String lieu, String fisrtequipe, String secondequipe) {
        this.id = id;
        this.ref = ref;
        this.date = date;
        this.lieu = lieu;
        this.fisrtequipe = fisrtequipe;
        this.secondequipe = secondequipe;
    }
}
