package com.idat.MSPizzeria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.MSPizzeria.model.Pizzeria;

@Repository
public interface PizzeriaRepository extends JpaRepository<Pizzeria, Integer>{

}
