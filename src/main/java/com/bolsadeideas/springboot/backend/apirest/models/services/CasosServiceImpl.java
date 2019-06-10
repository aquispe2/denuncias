package com.bolsadeideas.springboot.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bolsadeideas.springboot.backend.apirest.models.dao.ICasosDao;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Casos;

@Service
public class CasosServiceImpl implements ICasosService {

	@Autowired
	private ICasosDao casosDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Casos> findAll() {
		return (List<Casos>) casosDao.findAll();
	}

	@Override
	public Casos InssertOrUpdate(Casos casos){
		casosDao.save(casos);
		return casos;
	}
	

}
