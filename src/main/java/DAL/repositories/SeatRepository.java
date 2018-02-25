package DAL.repositories;

import DAL.Entities.SeatEntity;
import org.springframework.data.repository.CrudRepository;

public interface SeatRepository extends CrudRepository<SeatEntity,Integer> {
}
