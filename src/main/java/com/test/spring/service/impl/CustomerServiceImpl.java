package com.test.spring.service.impl;

import com.test.spring.dao.PersonDao;
import com.test.spring.domain.Person;
import com.test.spring.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    @Qualifier("personDao")
    private PersonDao personDao;

    @Override
    public Person findPerson(Person person) {
        return personDao.find(person);
    }

    @Override
    public List<Person> findAllPerson() {
        return personDao.findAll();
    }

    @Override
    public void addPerson(Person person) {
        personDao.insert(person);
    }

    @Override
    public void deletePerson(Person person) {
        personDao.delete(person);
    }
}
