package ru.gb.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Component
public class InformationBoard {

    TicketNumberGenerator ticketNumberGenerator;

    public InformationBoard(TicketNumberGenerator ticketNumberGenerator){
        this.ticketNumberGenerator = ticketNumberGenerator;
    }

    List<Ticket> ticketList = new ArrayList<>();

    public List<Ticket> newTicket(){
        for (int i = 0; i < 10; i++) {
            Ticket ticket = new Ticket();
            ticket.setName(Integer.toString(i+1));
            ticket.setNumber(ticketNumberGenerator.createNewNumber());
            ticket.setCreatedAt(LocalDateTime.now());
            ticketList.add(ticket);
        }
        return ticketList;


    }

}
