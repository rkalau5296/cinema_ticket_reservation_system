package cinema.facade;

import cinema.domain.Screening;
import javafx.stage.Screen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import cinema.service.ScreeningService;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Component
public class ScreeningFacade {

    @Autowired
    private ScreeningService screeningService;

    public List<Screening> getAllScreeningsFromDb(){
        return screeningService.getAllScreeningsFromDb();
    }

    public List<Screening> getMoviesInInterval(String dateFrom, String dateTo) {
        return screeningService.getMoviesInInterval(dateFrom, dateTo);
    }
    public List<Screening> getMoviesByDayAndTime(String dateFrom, String dateTo, String time) {
        return screeningService.getMoviesByDayAndTime(dateFrom,dateTo,time);
    }
}
