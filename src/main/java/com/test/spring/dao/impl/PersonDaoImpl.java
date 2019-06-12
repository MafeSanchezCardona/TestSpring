package com.test.spring.dao.impl;

import com.test.spring.dao.PersonDao;
import com.test.spring.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Repository
@Qualifier("personDao")
public class PersonDaoImpl implements PersonDao {

    private List<Person> personList;

    @Override
    public Person find(Person entity) {

        Person personReturn = personList.stream()
                .filter(personFilter -> (entity.getName().equals(personFilter.getName()) && entity.getLastName().equals(personFilter.getLastName())))
                .findAny()
                .orElse(null);

        return personReturn;
    }

    @Override
    public List<Person> findAll() {
        return personList;
    }

    @Override
    public void insert(Person entity) {
        personList.add(entity);
    }

    @Override
    public Person update(Person entity) {
        this.delete(entity);
        this.insert(entity);
        return entity;
    }

    @Override
    public void delete(Person entity) {
        Person personFind = find(entity);
        personList.remove(personFind);
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    //@PostConstruct
    public void inicializa() {
        System.out.println("Init Bean");
    }

    //@PreDestroy
    public void libera() {
        System.out.println("Destroy Bean");
    }
}
