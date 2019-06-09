package com.test.spring.service.impl;

import com.test.spring.dao.PersonaDao;
import com.test.spring.dominio.Persona;
import com.test.spring.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private PersonaDao personaDao;

    @Override
    public Persona find(long id) {
        return null;
    }

    @Override
    public List<Persona> findAll() {
        return personaDao.findAll();
    }

    @Override
    public void insert(Persona persona) {

    }

    @Override
    public Persona update(Persona persona) {
        return null;
    }

    @Override
    public void delete(Persona persona) {

    }
}
