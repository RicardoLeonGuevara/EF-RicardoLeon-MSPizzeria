package com.idat.MSPizzeria.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.idat.MSPizzeria.dto.PizzeriaDTO;
import com.idat.MSPizzeria.model.Pizzeria;
import com.idat.MSPizzeria.repository.PizzeriaRepository;

@Service
public class PizzeriaServiceImpl implements PizzeriaService {
	@Autowired
	private PizzeriaRepository repository;
	
	@Override
	public List<PizzeriaDTO> listar() {
		List<PizzeriaDTO> listado = new ArrayList<>();
		PizzeriaDTO dto = null;
				
		for (Pizzeria pizzeria : repository.findAll()) {
			dto = new PizzeriaDTO();
			
			dto.setCodigo(pizzeria.getIdPizzeria());
			dto.setDireccion(pizzeria.getDireccion());
			dto.setSede(pizzeria.getSede());
			listado.add(dto);
		}

		return listado;
	}
	
	@Override
	public void guardar(PizzeriaDTO pizzeria) {
		Pizzeria piz = new Pizzeria();
		
		piz.setIdPizzeria(pizzeria.getCodigo());
		piz.setDireccion(pizzeria.getDireccion());
		piz.setSede(pizzeria.getSede());

		repository.save(piz);
	}
}
