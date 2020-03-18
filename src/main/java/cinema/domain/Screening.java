package cinema.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity(name = "screening")
public class Screening {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    @OneToMany(
            cascade = CascadeType.ALL,
            fetch =  FetchType.LAZY
    )
    private List<Movie> movie;

    @Column
    private String date;

    @Column
    private String time;

    @Column
    @OneToMany(

            cascade = CascadeType.ALL,
            fetch =  FetchType.LAZY
    )
    private List<Room> screeningRoom;
}
