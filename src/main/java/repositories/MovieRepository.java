package repositories;

import Entities.MovieEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Repository
public interface MovieRepository  extends CrudRepository<MovieEntity,Integer>{


    
}
