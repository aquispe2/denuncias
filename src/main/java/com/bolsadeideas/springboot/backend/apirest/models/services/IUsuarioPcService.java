package com.bolsadeideas.springboot.backend.apirest.models.services;

import com.bolsadeideas.springboot.backend.apirest.models.entity.UsuariosPc;

import java.util.List;

public interface IUsuarioPcService {
    public List<UsuariosPc> findAll();

    public UsuariosPc add(UsuariosPc usuariosPc);
}
