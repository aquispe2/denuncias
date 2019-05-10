package com.bolsadeideas.springboot.backend.apirest.models.services;

import com.bolsadeideas.springboot.backend.apirest.models.dao.IDocumentosDao;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Documentos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocumentosServiceImpl implements IDocumentosService {
    @Autowired
    private IDocumentosDao documentosDao;

    @Override
    public Documentos add(Documentos documentos){
        documentosDao.save(documentos);
        return documentos;
    }
}
