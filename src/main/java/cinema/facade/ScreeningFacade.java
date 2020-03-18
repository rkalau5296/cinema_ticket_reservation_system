package cinema.facade;

import cinema.domain.Screening;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import cinema.service.ScreeningService;

import java.util.List;

@Component
public class ScreeningFacade {

    @Autowired
    private ScreeningService screeningService;

    public List<Screening> getMoviesByDateAndTime(String date, String time) {
        return screeningService.getScreeningByDateAndTime(date, time);
    }

}
