package com.example.cont.repos;

import com.example.cont.doa.Match;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface MatchRepo extends JpaRepository<Match,Integer> {

    Match findByRef(String g);

}
