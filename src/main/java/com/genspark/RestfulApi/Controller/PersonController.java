package com.genspark.RestfulApi.Controller;

import com.genspark.RestfulApi.Model.Person;
import com.genspark.RestfulApi.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class PersonController {
    @Autowired
    PersonService personService;

    @GetMapping("/person")
    Iterable<Person> read(){
        return personService.findAll();
    }

    @PostMapping("/person")
    Person create(@RequestBody Person person){
        return personService.save(person);
    }

    @PutMapping("/person")
    Person update(@RequestBody Person person){
        return personService.save(person);
    }

    @DeleteMapping("/person/{id}")
    void delete(@PathVariable Long id){
        personService.deleteById(id);
    }

    @GetMapping("/person/{id}")
    Optional<Person> findById(@PathVariable Long id){
        return personService.findById(id);
    }

}
