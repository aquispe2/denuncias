package com.bolsadeideas.springboot.backend.apirest.models.services;

import com.bolsadeideas.springboot.backend.apirest.models.dao.IUsuarioMovilDao;
import com.bolsadeideas.springboot.backend.apirest.models.dao.IUsuarioPcDao;
import com.bolsadeideas.springboot.backend.apirest.models.entity.UsuariosPc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sun.rmi.runtime.Log;

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
    public UsuariosPc insertOrUpdate(UsuariosPc usuariosPc) {
        usuarioPcDao.save(usuariosPc);
        return usuariosPc;
    }

    @Override
    public List<UsuariosPc> verificarUsuario(String pCi) {
       return  usuarioPcDao.verificarUsuario(pCi);
    }

    @Override
    public UsuariosPc findBy(Long id) {
        return usuarioPcDao.findById(id).get();
    }

}
