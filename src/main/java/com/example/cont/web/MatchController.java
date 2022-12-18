package com.example.cont.web;

import com.example.cont.doa.Match;
import com.example.cont.doa.Ticket;
import com.example.cont.service.IMatch;
import com.example.cont.service.ITicket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

@Controller
public class MatchController {
    @Autowired
    IMatch imatch;

    @Autowired
    ITicket ticket;

    @MutationMapping
    String addmatch(@Argument Match c){

        return imatch.addmatch(c);

    }

    @MutationMapping
    String buytickets(@Argument int id){

        return ticket.buyTicket(id);

    }

    @MutationMapping
    String updateticketes(@Argument int id,@Argument Ticket t){
         return ticket.updateTicket(id,t);
    }

    @MutationMapping
    String testupdateticketes(@Argument int id,@Argument int i){
        return ticket.testbuyTicket(id,i);
    }
}
