package bg.uktc.siteCrud.cats.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@CrossOrigin(origins = "http://localhost:3000")
public class HelloController {
    @GetMapping("/")
    public String hello() {
        return "helloDani";
    }
}
