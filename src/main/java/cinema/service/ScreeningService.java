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

    public List<Screening> getScreeningByDateAndTime (String date, String time){
        return screeningRepository.findAllByDateAndTime(date, time);
    }
}
