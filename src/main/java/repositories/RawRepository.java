package repositories;

import Entities.RawEntity;
import org.springframework.data.repository.CrudRepository;

public interface RawRepository extends CrudRepository<RawEntity,Integer> {
}
