package com.lab4nc.cinema;

import com.google.inject.internal.util.Lists;
import com.lab4nc.cinema.DAL.Entities.MovieEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
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
}
