package com.test.spring.web;

import com.test.spring.domain.Person;
import com.test.spring.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class AppController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/")
    @ResponseBody
    public ModelAndView load() {

        ModelAndView modelAndView = new ModelAndView("index");
        List<Person> personList = customerService.findAllPerson();
        modelAndView.addObject("personList", personList);

        return modelAndView;
    }

}
