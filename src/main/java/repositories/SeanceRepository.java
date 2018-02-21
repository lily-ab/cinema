package repositories;

import entities.Seance;
import org.springframework.data.repository.CrudRepository;

public interface SeanceRepository extends CrudRepository<Seance,Integer> {
}
