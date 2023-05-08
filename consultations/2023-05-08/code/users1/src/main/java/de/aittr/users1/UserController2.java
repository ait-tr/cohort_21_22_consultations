package de.aittr.users1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController2 {
    List<User> users = new ArrayList<>(
       List.of(
            new User("Jack", "Berlin"),
            new User("Ann", "Oslo")
       )
    );
    // localhost:8080/users
    @GetMapping(value="/rest-users")
    public List<User> userList(){
      return users;
    }


}
