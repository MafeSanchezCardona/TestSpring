package com.test.spring;

import com.test.spring.dao.PersonaDao;
import com.test.spring.dao.impl.PersonaDaoImpl;
import com.test.spring.dominio.Persona;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class App {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");

        Persona persona = (Persona) context.getBean("persona");
        System.out.println(persona.getApellido());

        Persona persona2 = (Persona) context.getBean("persona2");
        System.out.println(persona2.getApellido());

        List<Persona> personaList = (List<Persona>) context.getBean("personaList");

        personaList.forEach(item->System.out.println(item));

        PersonaDao personaDao = new PersonaDaoImpl();

        List<Persona> personaList2 = personaDao.findAll();

        personaList2.forEach(item->System.out.println(item));

    }
}
