package com.test.spring.web;

import com.test.spring.domain.Person;
import com.test.spring.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/find-all.do", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<Person>> findAll() {

        List<Person> personList = customerService.findAllPerson();

        return new ResponseEntity<>(personList, HttpStatus.OK);
    }
}
