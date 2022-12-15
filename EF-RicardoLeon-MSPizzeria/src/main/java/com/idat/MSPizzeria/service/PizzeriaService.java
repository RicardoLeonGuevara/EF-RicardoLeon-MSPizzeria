package com.idat.MSPizzeria.service;

import java.util.List;

import com.idat.MSPizzeria.dto.PizzeriaDTO;

public interface PizzeriaService {
	List<PizzeriaDTO> listar();
	void guardar(PizzeriaDTO pizzeria);
}
