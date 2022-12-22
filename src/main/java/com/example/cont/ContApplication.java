package com.example.cont;

import com.example.cont.doa.Match;
import com.example.cont.doa.Ticket;
import com.example.cont.enums.Statut;
import com.example.cont.repos.MatchRepo;
import com.example.cont.repos.Ticketrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class ContApplication implements CommandLineRunner {
	@Autowired
	MatchRepo matchRepo;
	@Autowired
	Ticketrepo ticketrepo;

	public static void main(String[] args) {
		SpringApplication.run(ContApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//matchRepo.save(
		//		new Match(null,"zakaria",new Date(),"lieu","fisrtequipe","secondequipe")
		//);

		//Match m = matchRepo.findByRef("zakaria");
		//System.out.println(m.getRef());

		//for(int i=1; i<2023; i++){
		//	ticketrepo.save(new Ticket(null,"reference"+i ,i,(i%2 == 0) ? Statut.ACTIVER : Statut.DESACTIVER,m));

		//}
	}
}
