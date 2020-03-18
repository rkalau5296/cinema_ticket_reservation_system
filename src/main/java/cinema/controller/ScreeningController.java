package cinema.controller;

import cinema.domain.Screening;
import cinema.facade.ScreeningFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
@CrossOrigin("*")
public class ScreeningController {

    @Autowired
    private ScreeningFacade screeningFacade;

    @RequestMapping(method = RequestMethod.GET, value = "/screening/{date}/{time}")
    public List<Screening> getAvailableMoviesByDateAndTime (@PathVariable String date, @PathVariable String time) {
        return screeningFacade.getMoviesByDateAndTime(date, time);
    }
}
