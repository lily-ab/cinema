package DAL.repositories;

import DAL.Entities.SeanceEntity;
import org.springframework.data.repository.CrudRepository;

public interface SeanceRepository extends CrudRepository<SeanceEntity,Integer> {
}
