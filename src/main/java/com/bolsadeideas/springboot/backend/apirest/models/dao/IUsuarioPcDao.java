package com.bolsadeideas.springboot.backend.apirest.models.dao;

import com.bolsadeideas.springboot.backend.apirest.models.entity.UsuariosPc;
import org.springframework.data.repository.CrudRepository;

public interface IUsuarioPcDao extends CrudRepository<UsuariosPc, Long> {
}
