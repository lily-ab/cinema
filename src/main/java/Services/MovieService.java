package Services;

import Entities.MovieEntity;

import java.util.List;

public interface MovieService {
    List<MovieEntity> findAll();
}
