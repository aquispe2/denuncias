package com.bolsadeideas.springboot.backend.apirest.models.dao;

import com.bolsadeideas.springboot.backend.apirest.models.entity.UsuarioMovil;
import com.bolsadeideas.springboot.backend.apirest.models.entity.UsuariosPc;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IUsuarioMovilDao extends CrudRepository<UsuarioMovil, Long> {

    @Query(value = "SELECT d FROM UsuarioMovil d WHERE d.estado_id = 1000 and d.ci = :pCi and d.mail = :pMail ")
    List<UsuarioMovil> verificarUsuarioMovil(@Param("pCi") String pCi, @Param("pMail") String pMail);

}
