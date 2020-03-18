package cinema.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class TicketDto {

    private Long id;
    private String name;
    private String surname;
    private int adults;
    private int students;
    private int children;
    private int totalAmountOfSeats;
    private double totalPrice;
    private String reservationExpirationTime;
}
