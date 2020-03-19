package cinema.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "ticket")
public class Ticket {

    private Long id;
    private String name;
    private String surname;
    private int adults;
    private int students;
    private int children;
    private double totalPrice;
    private String reservationExpirationTime;



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @Column
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Column
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    @Column
    public int getAdults() {
        return adults;
    }

    public void setAdults(int adults) {
        this.adults = adults;
    }
    @Column
    public int getStudents() {
        return students;
    }

    public void setStudents(int students) {
        this.students = students;
    }
    @Column
    public int getChildren() {
        return children;
    }

    public void setChildren(int children) {
        this.children = children;
    }
    @Column
    public double getTotalPrice() {
        return totalPrice = adults * 25.00 + students * 18.00 + children * 12.50;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Column
    public String getReservationExpirationTime() {
        return reservationExpirationTime;
    }

    public void setReservationExpirationTime(String reservationExpirationTime) {
        this.reservationExpirationTime = reservationExpirationTime;
    }
}
