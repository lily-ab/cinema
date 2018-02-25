package BLL.Services;

import DAL.Entities.MovieEntity;

import java.util.List;

public interface MovieService {
    List<MovieEntity> findAll();
}
