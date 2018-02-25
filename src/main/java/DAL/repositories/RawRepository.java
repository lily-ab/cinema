package DAL.repositories;

import DAL.Entities.RawEntity;
import org.springframework.data.repository.CrudRepository;

public interface RawRepository extends CrudRepository<RawEntity,Integer> {
}
