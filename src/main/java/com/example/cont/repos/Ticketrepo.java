package com.example.cont.repos;

import com.example.cont.doa.Match;
import com.example.cont.doa.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface Ticketrepo extends JpaRepository<Ticket,Integer> {

    List<Ticket> findByMatch(Match match);

}
