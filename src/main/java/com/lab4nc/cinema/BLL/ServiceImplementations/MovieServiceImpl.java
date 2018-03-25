package com.lab4nc.cinema.BLL.ServiceImplementations;

import com.google.inject.internal.util.Lists;
import com.lab4nc.cinema.BLL.Services.MovieService;
import com.lab4nc.cinema.DAL.Entities.MovieEntity;
import com.lab4nc.cinema.DAL.Entities.SeanceEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import com.lab4nc.cinema.DAL.repositories.MovieRepository;

import javax.transaction.Transactional;
import java.util.List;
//@Service("MovieService")
@Repository
@Transactional
@Component
public class MovieServiceImpl implements MovieService {
    @Autowired
    MovieRepository movieRep;

    @Override
    public List<MovieEntity> findAll() {
        return Lists.newArrayList(movieRep.findAll());
    }

    @Override
    public MovieEntity find(int id){
        return movieRep.findOne(id);
    }

    @Override
    public List<SeanceEntity> getSeances(int id){
        return Lists.newArrayList(movieRep.findOne(id).getSeancesByIdMovie());
    }
}
