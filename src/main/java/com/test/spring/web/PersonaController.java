package com.test.spring.web;

import com.test.spring.dominio.Persona;
import com.test.spring.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/persona")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @RequestMapping(value = "/find-all.do", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<Persona>> findAll() {

        List<Persona> personaList = personaService.findAll();

        return new ResponseEntity<>(personaList, HttpStatus.OK);
    }
}
