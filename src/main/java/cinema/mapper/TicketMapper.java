package cinema.mapper;

import cinema.domain.Ticket;
import cinema.dto.TicketDto;
import org.springframework.stereotype.Component;

@Component
public class TicketMapper {
    public Ticket mapToTicket(final TicketDto ticketDto) {
        return new Ticket(
                ticketDto.getId(),
                ticketDto.getName(),
                ticketDto.getSurname(),
                ticketDto.getAdults(),
                ticketDto.getStudents(),
                ticketDto.getChildren(),
                ticketDto.getTotalAmountOfSeats(),
                ticketDto.getTotalPrice(),
                ticketDto.getReservationExpirationTime()
        );
    }
}
