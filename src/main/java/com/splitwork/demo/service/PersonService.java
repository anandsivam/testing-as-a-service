package com.splitwork.demo.service;


import com.splitwork.demo.entity.Person;

import java.util.List;

public interface PersonService {
    public List<Person> getListOfPerson();

    Person savePerson(Person person);
}
