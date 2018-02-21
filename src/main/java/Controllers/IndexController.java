package Controllers;

import entities.Movie;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import repositories.MovieRepository;

import java.util.HashMap;
import java.util.Map;

@RequestMapping("/cinema")
@Controller
public class IndexController {

    MovieRepository mov;
    IndexController(MovieRepository mov){
        this.mov=mov;
    }
    @ResponseBody
    @GetMapping("/")
    public ModelAndView index(){
        Map<String,String> model=new HashMap<>();
        model.put("Hello","World");
        return new ModelAndView("index",model);
    }
    @GetMapping("/movies")
    public String getMovies(){
        String s=null;
        for(Movie m: mov.findAll()){
            s+=m;
        }
        return s;
    }
}
