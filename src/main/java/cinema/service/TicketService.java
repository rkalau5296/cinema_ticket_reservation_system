package cinema.service;

import cinema.domain.Ticket;
import cinema.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static java.util.Optional.ofNullable;

@Service
public class TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    public Ticket save(final Ticket ticket) {

        return ticketRepository.save(ticket);
    }
}
