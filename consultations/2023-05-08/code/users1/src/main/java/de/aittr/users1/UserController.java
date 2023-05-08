package de.aittr.users1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
    List<User> users = new ArrayList<>(
       List.of(
            new User("Jack", "Berlin"),
            new User("Ann", "Oslo")
       )
    );
    // localhost:8080/users
    @GetMapping(value="/users")
    public String userList(){
      return "users";
    }


}
