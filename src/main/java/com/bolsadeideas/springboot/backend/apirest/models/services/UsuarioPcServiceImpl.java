package com.bolsadeideas.springboot.backend.apirest.models.services;

import com.bolsadeideas.springboot.backend.apirest.models.dao.IUsuarioMovilDao;
import com.bolsadeideas.springboot.backend.apirest.models.dao.IUsuarioPcDao;
import com.bolsadeideas.springboot.backend.apirest.models.entity.UsuariosPc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UsuarioPcServiceImpl implements IUsuarioPcService{

    @Autowired
    private IUsuarioPcDao usuarioPcDao;

    @Override
    @Transactional(readOnly = true)
    public List<UsuariosPc> findAll() {
        return (List<UsuariosPc>)usuarioPcDao.findAll();
    }

    @Override
    public UsuariosPc add(UsuariosPc usuariosPc) {
        return null;
    }
}
