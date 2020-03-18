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

    @RequestMapping(method = RequestMethod.GET, value = "/screening/{dateFrom}/{dateTo}")
    public List<Screening> getAvailableMoviesInInterval (@PathVariable String dateFrom, @PathVariable String dateTo) {
        return screeningFacade.getMoviesInInterval(dateFrom, dateTo);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/screening")
    public List<Screening> getProductsFromDb() {
        return screeningFacade.getAllScreeningsFromDb();
    }

}
