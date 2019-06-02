package com.bolsadeideas.springboot.backend.apirest.models.services;

import com.bolsadeideas.springboot.backend.apirest.models.dao.ICasosDao;
import com.bolsadeideas.springboot.backend.apirest.models.dao.IUsuarioMovilDao;
import com.bolsadeideas.springboot.backend.apirest.models.entity.UsuarioMovil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UsuarioMovilServiceImpl  implements IUsuarioMovilService {

    @Autowired
    private IUsuarioMovilDao usuarioMovilDao;

    @Override
    @Transactional(readOnly = true)
    public List<UsuarioMovil> findAll() {
        return (List<UsuarioMovil>)usuarioMovilDao.findAll();
    }

    @Override
    public UsuarioMovil add(UsuarioMovil usuarioMovil) {
        return usuarioMovilDao.save(usuarioMovil);
    }
}
