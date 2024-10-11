package com.idat.springbootweb.app.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.idat.springbootweb.app.models.domain.profesores;
import com.idat.springbootweb.app.models.domain.usuario;

public class ForController {
    @GetMapping("/for")
    public String form(Model model) 
    {
        model.addAttribute("titulo", "REGISTRO DE USUARIO A LA ACADEMIA DEPORTIVA");
        return "for";
    }

    @PostMapping("/for")
    public String procesar(Model model, 
                           @RequestParam(name="profesores") String usuario,
                           @RequestParam String pass ,
                              @RequestParam String email)
    {
    	profesores PROFESORES =new  profesores();
    	PROFESORES.setUsuario(usuario);
    	PROFESORES.setPass(pass);
    	PROFESORES.setEmail(email);
        model.addAttribute("titulo", "ALUMNO REGISTRO");
        model.addAttribute("usuario", PROFESORES);
        //model.addAttribute("pass", pass);
       // model.addAttribute("email", email);
        return "result";
    }
}
