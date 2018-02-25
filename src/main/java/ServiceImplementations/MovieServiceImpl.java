package ServiceImplementations;

import Entities.MovieEntity;
import Services.MovieService;
import com.google.inject.internal.util.Lists;
import groovy.lang.Lazy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import repositories.MovieRepository;

import javax.transaction.Transactional;
import java.util.List;
@Service("MovieService")
@Repository
@Transactional
public class MovieServiceImpl implements MovieService {
    @Autowired
    MovieRepository movieRep;

    @Override
    public List<MovieEntity> findAll() {
        return Lists.newArrayList(movieRep.findAll());
    }
}
