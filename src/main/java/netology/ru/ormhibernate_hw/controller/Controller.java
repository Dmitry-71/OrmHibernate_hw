package netology.ru.ormhibernate_hw.controller;

import netology.ru.ormhibernate_hw.entity.Person;
import netology.ru.ormhibernate_hw.repository.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    private final Repository repository;

    public Controller(Repository repository) {
        this.repository = repository;
    }

    @GetMapping("/by-city")
    public List<Person> getPersonByCity(@RequestParam("city") String city) {
        return repository.getPersonsByCity(city);
    }
}
