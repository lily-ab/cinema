package com.lab4nc.cinema.DAL.repositories;

import com.lab4nc.cinema.DAL.Entities.MovieEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MovieRepository  extends CrudRepository<MovieEntity,Integer>{


    
}
