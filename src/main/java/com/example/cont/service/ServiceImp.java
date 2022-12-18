package com.example.cont.service;

import com.example.cont.doa.Match;
import com.example.cont.doa.Ticket;
import com.example.cont.enums.Statut;
import com.example.cont.repos.MatchRepo;
import com.example.cont.repos.Ticketrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceImp implements ITicket,IMatch {
    @Autowired
    MatchRepo matchRepo;
    @Autowired
    Ticketrepo ticketrepo;


    @Override
    public String addmatch(Match matc) {
       matchRepo.save(matc);
       return "save match";
    }

    @Override
    public String buyTicket(int i) {
        Ticket e = ticketrepo.findById(i).orElse(null);
        List<Ticket> t= ticketrepo.findAll();
        System.out.println(t.size());
        if(e == null){
            return "not ticket availabel";
        }else {
                e.setStatut(Statut.ACTIVER);
                ticketrepo.save(e);
                return "you just bought a ticket";



        }
    }

    @Override
    public String testbuyTicket(int id,int i) {
        Match m = matchRepo.findById(id).orElse(null);
        if (m != null){
            List<Ticket> t = ticketrepo.findByMatch(m);
            List<Ticket> newone = new ArrayList<>();
            t.forEach(x->{
                if (x.getStatut().equals(Statut.DESACTIVER)) {
                    newone.add(x);
                }
            });
            if (newone.size() < 2022) {
                for (Ticket x : t) {
                    if (x.getId() == i) {
                        x.setStatut(Statut.ACTIVER);
                        ticketrepo.save(x);
                        return "you just bought a ticket";

                    }
                }
            }else {
                return "not in stock";
            }
        }


        return "no match";

    }

    @Override
    public String updateTicket(Integer id,Ticket ticket) {
        Ticket e = ticketrepo.findById(id).orElse(null);
        if (e == null ) {
            return "not found";

        }else {
            e.setRef(ticket.getRef());
            e.setStatut(ticket.getStatut());
            e.setPrice(ticket.getPrice());
            ticketrepo.save(e);
            return "saved";
        }


    }
}
