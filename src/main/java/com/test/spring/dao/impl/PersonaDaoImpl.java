package com.test.spring.dao.impl;

import com.test.spring.App;
import com.test.spring.dao.PersonaDao;
import com.test.spring.dominio.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonaDaoImpl implements PersonaDao {

    @Autowired
    private ApplicationContext context;

    @Override
    public Persona find(long id) {
        return null;
    }

    @Override
    public List<Persona> findAll() {
        return (List<Persona>) context.getBean("personaList");
    }

    @Override
    public void insert(Persona entity) {

    }

    @Override
    public Persona update(Persona entity) {
        return null;
    }

    @Override
    public void delete(Persona entity) {

    }
}
