package com.lab4nc.cinema;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {
    MovieService mov;
    ApplicationContext context;

    HomeController(MovieServiceImpl mov){
        this.mov=mov;
    }

    @RequestMapping(value = {"/","/index" }, method= RequestMethod.GET)
    public String main(Model model){
        model.addAttribute("movies", mov.findAll());
        return "index";
    }

    @RequestMapping(value="/movies", method= RequestMethod.GET)
    public String getMovies(ModelMap map){
        MovieService bean=context.getBean(MovieService.class);
        StringBuilder sb = new StringBuilder("<br>");
        bean.findAll().forEach(it->sb.append(it.toString()).append("<br>"));
        map.addAttribute("movies", sb.toString());
        return "movies";
    }
}
