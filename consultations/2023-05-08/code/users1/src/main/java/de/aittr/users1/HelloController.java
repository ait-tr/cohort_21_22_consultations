package de.aittr.users1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
//  localhost:8080
    @GetMapping("/")
    public String sayHello(){
        return "hello-page";
    }

}
