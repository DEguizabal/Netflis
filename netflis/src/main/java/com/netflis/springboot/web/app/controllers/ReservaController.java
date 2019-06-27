package com.netflis.springboot.web.app.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.netflis.springboot.web.app.models.entity.Usuario;
import com.netflis.springboot.web.app.models.service.IUsuarioService;

@Controller
@RequestMapping("/factura")
public class ReservaController {
	
	@Autowired
	private IUsuarioService usuarioService;
	
	@GetMapping("/form/{idUsuario}")
	public String crear(@PathVariable(value = "idUsuario") Long idUsuario,
			Map<String, Object> model,
			RedirectAttributes flash) {
		
		Usuario usuario = usuarioService.findOne(idUsuario);
		if(usuario == null) {
			flash.addFlashAttribute("error", "El usuario no existe.");
			return "redirect:/table/user-table";
		}
		
		
		return "forms/factura-form";
	
	}

}
