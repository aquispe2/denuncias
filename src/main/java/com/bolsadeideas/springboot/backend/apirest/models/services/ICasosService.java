package com.bolsadeideas.springboot.backend.apirest.models.services;

import java.util.List;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Casos;

public interface ICasosService {
	
	public List<Casos> findAll();
	public Casos add(Casos casos);

}
