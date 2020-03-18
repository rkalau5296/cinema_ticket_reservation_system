package cinema.repository;

import cinema.domain.Screening;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ScreeningRepository extends CrudRepository<Screening, String> {

    @Override
    List<Screening> findAll();


    List<Screening> findAllByDateAndTime(String date, String time);
}
