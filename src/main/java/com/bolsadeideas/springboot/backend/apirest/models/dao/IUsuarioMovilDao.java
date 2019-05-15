package com.bolsadeideas.springboot.backend.apirest.models.dao;

import com.bolsadeideas.springboot.backend.apirest.models.entity.UsuarioMovil;
import org.springframework.data.repository.CrudRepository;

public interface IUsuarioMovilDao extends CrudRepository<UsuarioMovil, Long> {
}
