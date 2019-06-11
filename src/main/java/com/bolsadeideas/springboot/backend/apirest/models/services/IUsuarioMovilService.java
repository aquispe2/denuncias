package com.bolsadeideas.springboot.backend.apirest.models.services;

import com.bolsadeideas.springboot.backend.apirest.models.entity.UsuarioMovil;
import com.bolsadeideas.springboot.backend.apirest.models.entity.UsuariosPc;

import java.util.List;

public interface IUsuarioMovilService {
    public List<UsuarioMovil> findAll();
    public UsuarioMovil add(UsuarioMovil usuarioMovil);

    public List<UsuarioMovil>  verificarUsuarioMovil(String ci, String mail);
}
