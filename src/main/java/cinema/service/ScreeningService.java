package cinema.service;

import cinema.domain.Screening;
import cinema.repository.ScreeningRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScreeningService {

    @Autowired
    private ScreeningRepository screeningRepository;

    public List<Screening> getAllScreeningsFromDb() {
        return screeningRepository.findAll();
    }

    public List<Screening> getMoviesInInterval(String dateFrom, String dateTo) {
        return screeningRepository.findAllByDateBetween(dateFrom, dateTo);
    }

}
