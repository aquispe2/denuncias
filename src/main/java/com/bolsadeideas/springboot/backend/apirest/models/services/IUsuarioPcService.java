package com.bolsadeideas.springboot.backend.apirest.models.services;

import com.bolsadeideas.springboot.backend.apirest.models.entity.UsuariosPc;

import java.util.List;

public interface IUsuarioPcService {

    public UsuariosPc findBy(Long id);

    public List<UsuariosPc> findAll();

    public UsuariosPc insertOrUpdate(UsuariosPc usuariosPc);

    public void delete(UsuariosPc usuariosPc);

}
