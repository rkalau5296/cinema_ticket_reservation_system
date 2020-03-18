package cinema.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class TicketType {
    private double adult = 25.00;
    private double student = 18.00;
    private double child = 12.50;
}
