package com.genspark.RestfulApi.Controller;

import com.genspark.RestfulApi.Model.NumberName;
import com.genspark.RestfulApi.Service.NumberNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class NumberNameController {
    @Autowired
    private NumberNameService numberNameService;

    @GetMapping("/number")
    Iterable<NumberName> read() {
        return numberNameService.findAll();
    }

    @PostMapping("/number")
    NumberName create(@RequestBody NumberName numberName) {
        return numberNameService.save(numberName);
    }

    @PutMapping("/number")
    NumberName update(@RequestBody NumberName numberName) {
        return numberNameService.save(numberName);
    }

    @DeleteMapping("/number/{id}")
    void delete(@PathVariable Long id) {
        numberNameService.deleteById(id);
    }

    @GetMapping("/number/{id}")
    Optional<NumberName> getById(@PathVariable Long id) {
        return numberNameService.findById(id);
    }

    @GetMapping("/number/search")
    Iterable<NumberName> findByQuery(@RequestParam(value = "name", required = false) String name,
                                 @RequestParam(value = "number", required = false) int number) {
        if (name != null) {
            return numberNameService.findByName(name);
        } else{
            return numberNameService.findByNumber(number);
        }
    }

}
