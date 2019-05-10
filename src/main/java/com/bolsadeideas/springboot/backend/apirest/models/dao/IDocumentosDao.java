package com.bolsadeideas.springboot.backend.apirest.models.dao;


import com.bolsadeideas.springboot.backend.apirest.models.entity.Documentos;
import org.springframework.data.repository.CrudRepository;

public interface IDocumentosDao extends CrudRepository<Documentos, Long> {

}
