package MVC.Controllers;

import BLL.Services.MovieService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import DAL.repositories.MovieRepository;

import java.util.HashMap;
import java.util.Map;


@Controller
public class HomeController {
    @Autowired
    ApplicationContext context;
    @Autowired
    MovieRepository mov;

    @ResponseBody
    @GetMapping("/")
    public String main(){
        Map<String,String> model=new HashMap<>();
        model.put("Hello","World");
        return "index";
    }
    @ResponseBody
    @RequestMapping(value="/movies", method= RequestMethod.GET)
    public String getMovies(ModelMap map){
        MovieService bean=context.getBean(MovieService.class);
        StringBuilder sb = new StringBuilder("<br>");
        bean.findAll().forEach(it->sb.append(it.toString()).append("<br>"));
        map.put("msg", sb.toString());
        return "index";
    }
}
