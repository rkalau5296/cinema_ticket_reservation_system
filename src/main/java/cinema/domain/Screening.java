package cinema.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity(name = "screening")
public class Screening {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(
            targetEntity = Movie.class,
            cascade = CascadeType.ALL,
            fetch =  FetchType.LAZY
    )
    @JoinColumn (name = "movies_id")
    private List<Movie> movies = new ArrayList<>();

    @Column
    private String date;

    @Column
    private String time;

    @OneToMany(
            targetEntity = ScreeningRoom.class,
            cascade = CascadeType.ALL,
            fetch =  FetchType.LAZY
    )
    @JoinColumn (name = "screeningRoom_id")
    private List<ScreeningRoom> screeningRooms = new ArrayList<>();

    @OneToMany(
            targetEntity = Seat.class,
            cascade = CascadeType.ALL,
            fetch =  FetchType.LAZY
    )
    @JoinColumn (name = "seats_id")
    private List<Seat> availability = new ArrayList<>();
}
