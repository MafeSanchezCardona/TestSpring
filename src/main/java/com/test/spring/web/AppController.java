package com.test.spring.web;

import com.test.spring.dominio.Persona;
import com.test.spring.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class AppController {

    @Autowired
    private PersonaService personaService;

    @RequestMapping(value = "/")
    @ResponseBody
    public ModelAndView load() {

        ModelAndView modelAndView = new ModelAndView("index");
        List<Persona> personaList = personaService.findAll();
        modelAndView.addObject("personaList", personaList);

        return modelAndView;
    }

}
