package MVCL.Controllers;

import BLL.Services.MovieService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import DAL.repositories.MovieRepository;



@Controller
public class HomeController {
    @Autowired
    ApplicationContext context;
    @Autowired
    MovieRepository mov;


    @RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
    public String main(Model model){
        String message = "Hello Spring Boot + JSP";
        model.addAttribute("message", message);
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
