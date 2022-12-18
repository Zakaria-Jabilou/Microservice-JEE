package com.example.cont.service;

import com.example.cont.doa.Match;
import com.example.cont.doa.Ticket;

public interface ITicket {

    public String buyTicket(int i);
    public String testbuyTicket(int id,int i);
    public String updateTicket(Integer id,Ticket ticket);

}
