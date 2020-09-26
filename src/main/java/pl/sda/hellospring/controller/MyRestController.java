package pl.sda.hellospring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.hellospring.model.Person;

@RestController
@RequestMapping("/rest")
public class MyRestController {

    @GetMapping("/my-name")
    public String myName() {
        return "mariusz";
    }

    @GetMapping("/person")
    public Person person() {
        return new Person("mariusz", "p.");
    }
}
