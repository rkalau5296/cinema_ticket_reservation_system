package cinema.facade;

import cinema.domain.Ticket;
import cinema.dto.TicketDto;
import cinema.mapper.TicketMapper;
import cinema.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TicketFacade {

    @Autowired
    private TicketService ticketService;
    @Autowired
    private TicketMapper ticketMapper;

    public Ticket createTicket(TicketDto ticketDto) {
        return ticketService.save(ticketMapper.mapToTicket(ticketDto));
    }

}
