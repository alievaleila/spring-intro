package az.edu.turing.springintro;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;

@RestController
@RequestMapping("/users")

public class RestInHeavenController {
    @GetMapping
    public String getUsers() {
        return "Hello World";
    }

    @GetMapping("{id}")
    public String getUsersById(@PathVariable int id) {
        return "Hello  World +" + id;
    }

    @GetMapping(value = "/aaaa", produces = "application/json")
    public ResponseEntity<User> getUsersbyA() {
        return ResponseEntity.ok(new User("Do"));
    }

    public static class User implements Serializable {
        String name;

        public User(String name) {
            this.name = name;
        }
    }


}
