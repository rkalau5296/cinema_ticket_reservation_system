package cinema.dto;

import cinema.domain.Screening;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TicketDto {

    private Long id;
    private String name;
    private String surname;
    private int adults;
    private int students;
    private int children;
    private double totalPrice;
    private String reservationExpirationTime;
    private int totalPeopleAmount;
    private int screening_id ;

}
