package com.idat.MSPizzeria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.MSPizzeria.service.PizzeriaService;
import com.idat.MSPizzeria.dto.PizzeriaDTO;

@Controller
@RequestMapping("/api/pizzeria/v1")
public class PizzeriaController {
	@Autowired
	private PizzeriaService service;
	
	@GetMapping("/listar")
	public @ResponseBody List<PizzeriaDTO> listar(){
		return service.listar();
	}
	
	@PostMapping("/guardar")
	public @ResponseBody void guardar(@RequestBody PizzeriaDTO dto) {
		service.guardar(dto);
	}
}
