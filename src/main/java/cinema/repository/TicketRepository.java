package cinema.repository;

import cinema.domain.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketRepository extends CrudRepository<Ticket, Long> {

    @Override
    Ticket save (Ticket client);
}
