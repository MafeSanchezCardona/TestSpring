package com.test.spring.service;

import com.test.spring.domain.Person;

import java.util.List;

public interface CustomerService {

    Person findPerson(final Person person);

    List<Person> findAllPerson();

    void addPerson(final Person person);

    void deletePerson(final Person person);
}
