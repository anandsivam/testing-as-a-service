package com.splitwork.demo.controller;

import com.splitwork.demo.entity.Person;
import com.splitwork.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/splitwork")
public class SplitController {

    @Autowired
    private PersonService personService;

    @PostMapping("/person")
    public Person savePerson(@RequestBody Person person){

        return personService.savePerson(person);
    }



    @GetMapping("/person/p1")
    public List<Person> getListOfPersons(){

        return personService.getListOfPerson();
    }
}
