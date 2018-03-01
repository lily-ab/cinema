package com.lab4nc.cinema;

import com.lab4nc.cinema.DAL.Entities.MovieEntity;

import java.util.List;

public interface MovieService {
    List<MovieEntity> findAll();
}
