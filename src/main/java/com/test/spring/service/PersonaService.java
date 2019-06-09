package com.test.spring.service;

import com.test.spring.dominio.Persona;

import java.util.List;

public interface PersonaService {

    Persona find(final long id);

    List<Persona> findAll();

    void insert(final Persona persona);

    Persona update(final Persona persona);

    void delete(final Persona persona);
}
