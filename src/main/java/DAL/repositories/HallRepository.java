package DAL.repositories;

import DAL.Entities.HallEntity;
import org.springframework.data.repository.CrudRepository;

public interface HallRepository extends CrudRepository<HallEntity,Integer> {
}
