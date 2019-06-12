package com.test.spring;

import com.test.spring.dao.PersonDao;
import com.test.spring.dao.impl.PersonDaoImpl;
import com.test.spring.domain.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class App {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");

        List<Person> personList = (List<Person>) context.getBean("personaList");

        personList.forEach(item->System.out.println(item));

        PersonDao personDao = new PersonDaoImpl();

        List<Person> personList2 = personDao.findAll();

        personList2.forEach(item->System.out.println(item));

    }
}
