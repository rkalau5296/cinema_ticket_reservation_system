package cinema.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity(name = "screening")
public class Screening {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL, fetch =  FetchType.EAGER)
    @JoinColumn(name = "Movie")
    private Movie movie;

    @Column
    private String date;

    @Column
    private String time;

    @OneToOne(cascade = CascadeType.ALL, fetch =  FetchType.EAGER)
    @JoinColumn (name = "ROOM")
    private Room screeningRoom;
}
