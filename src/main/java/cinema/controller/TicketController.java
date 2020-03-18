package cinema.controller;

import cinema.domain.Ticket;
import cinema.dto.TicketDto;
import cinema.facade.TicketFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/v1")
@CrossOrigin("*")
public class TicketController {

    @Autowired
    private TicketFacade ticketFacade;

    @RequestMapping(method = RequestMethod.POST, value = "/ticket", consumes = APPLICATION_JSON_VALUE)
    public Ticket createTicket (@RequestBody TicketDto ticketDto) {
        return ticketFacade.createTicket(ticketDto);
    }
}
