package cinema.dto;

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


    public void setAdults(int newAdults) {this. adults = newAdults;};
    public void setStudent(int newStudents) {this. students = newStudents;};
    public void setChildren(int newChildren) {this. children = newChildren;};

    private double calculateTotalPrice() {
        System.out.println("here I am");
        return (adults * 25.00) + (students * 18.00) + (children * 12.50);
    }

    //Setter totalPrice
    public void setTotalPrice() {
        this.totalPrice = calculateTotalPrice();
    }
}
