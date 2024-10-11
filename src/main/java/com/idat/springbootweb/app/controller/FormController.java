package com.idat.springbootweb.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.idat.springbootweb.app.models.domain.usuario;

@Controller
public class FormController 
{
    @GetMapping("/form")
    public String form(Model model) 
    {
        model.addAttribute("titulo", "REGISTRO DE USUARIO A LA ACADEMIA DEPORTIVA");
        return "form";
    }

    @PostMapping("/form")
    public String procesar(Model model, 
                           @RequestParam(name="usuario") String usuario,
                           @RequestParam String pass ,
                              @RequestParam String email)
    {
    	usuario Usuario =new  usuario();
    	Usuario.setUsuario(usuario);
    	Usuario.setPass(pass);
    	Usuario.setEmail(email);
        model.addAttribute("titulo", "ALUMNO REGISTRO");
        model.addAttribute("usuario", Usuario);
        //model.addAttribute("pass", pass);
       // model.addAttribute("email", email);
        return "resultado";
    }

}