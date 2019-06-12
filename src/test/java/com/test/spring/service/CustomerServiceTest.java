package com.test.spring.service;

import com.test.spring.domain.Address;
import com.test.spring.domain.Person;
import com.test.spring.service.impl.CustomerServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:applicationContext.xml")
public class CustomerServiceTest {

    @Autowired
    private CustomerService customerService;

    private Person person;

    @Before
    public void  init() {

        Address address = new Address();
        address.setStreet("Calle 20");
        address.setApartment(1753);
        address.setNumber("12-30");

        person = new Person("Daniela", "Suarez", 23, new Date(), address);

        customerService.addPerson(person);
    }

    @Test
    public void addPersonTest() {

        Address address = new Address();
        address.setStreet("Calle 34");
        address.setApartment(1201);
        address.setNumber("34-30");

        Person person = new Person("Laura", "Perez", 23, new Date(), address);

        customerService.addPerson(person);

        Person personFind = customerService.findPerson(person);

        Assert.assertNotNull(personFind);
        Assert.assertEquals(personFind, person);

    }

    @Test
    public void getTest() {

        Person personFind = customerService.findPerson(person);

        Assert.assertNotNull(personFind);
        Assert.assertEquals(personFind, person);

    }

}
