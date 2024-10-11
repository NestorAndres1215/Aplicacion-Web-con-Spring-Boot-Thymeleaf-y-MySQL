package com.idat.springbootweb.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.idat.springbootweb.app.models.Usuario;

@Controller
@RequestMapping(value={"/app","/"})
public class IndexController 
{
	//Método que permitirá crear una vista
	@RequestMapping(value={"/index","/"}, method=RequestMethod.GET)
	public String index(ModelMap model)
	{
		model.addAttribute("titulo", "BIENVENIDO A LA ACADEMIA DEPORTIVA ANDRES");
		model.addAttribute("parrafo", "Lorem, ipsum dolor sit amet consectetur adipisicing elit. Molestiae explicabo sit illo. \r\n"
				+ "                Et distinctio odit nihil totam quibusdam? Accusamus veniam blanditiis cum nulla neque! Voluptatibus sit atque perspiciatis \r\n"
				+ "                quibusdam voluptates.\r\n"
				+ "            Lorem ipsum dolor, sit amet consectetur adipisicing elit. Minus, eos ab perferendis, sunt dicta optio adipisci \r\n"
				+ "            quae suscipit tempora inventore explicabo in quos, deserunt ad magnam qui excepturi libero. Exercitationem.");
		model.addAttribute("subtitulo", "Lo mejores profesores");
		return "index"; //index.html (Templates)
	}
	
	@RequestMapping(value= "/consulta")
	public ModelAndView indice(ModelAndView mv) 
	{
		mv.addObject("concepto","Hola Spring Framework con ModelAndView");
		mv.setViewName("indice");
		return mv;
	}
	

	

	
}
