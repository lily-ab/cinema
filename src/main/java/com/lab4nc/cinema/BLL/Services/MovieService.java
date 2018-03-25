package com.lab4nc.cinema.BLL.Services;

import com.lab4nc.cinema.DAL.Entities.MovieEntity;
import com.lab4nc.cinema.DAL.Entities.SeanceEntity;

import java.util.List;

public interface MovieService {
    List<MovieEntity> findAll();
    MovieEntity find(int id);
    List<SeanceEntity> getSeances(int id);
}
