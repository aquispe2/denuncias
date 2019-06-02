package com.bolsadeideas.springboot.backend.apirest.models.services;

import com.bolsadeideas.springboot.backend.apirest.models.entity.UsuarioMovil;

import java.util.List;

public interface IUsuarioMovilService {
    public List<UsuarioMovil> findAll();
    public UsuarioMovil add(UsuarioMovil usuarioMovil);
}
