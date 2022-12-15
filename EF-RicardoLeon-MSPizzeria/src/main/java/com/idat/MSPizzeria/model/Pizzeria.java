package com.idat.MSPizzeria.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
@Entity
@Table(name = "pizzeria")
@Getter
@Setter
public class Pizzeria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPizzeria;
	private String direccion;
	private String sede;
}
