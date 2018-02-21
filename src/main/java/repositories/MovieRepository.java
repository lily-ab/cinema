package repositories;

import entities.Movie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;


public interface MovieRepository  extends CrudRepository<Movie,Integer>{

}
