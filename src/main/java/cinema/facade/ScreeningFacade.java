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

    public List<Screening> getAllScreeningsFromDb(){
        return screeningService.getAllScreeningsFromDb();
    }

    public List<Screening> getMoviesInInterval(String dateFrom, String dateTo) {
        return screeningService.getMoviesInInterval(dateFrom, dateTo);
    }
}
