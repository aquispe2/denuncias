package com.bolsadeideas.springboot.backend.apirest.models.dao;

import com.bolsadeideas.springboot.backend.apirest.models.entity.UsuariosPc;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IUsuarioPcDao extends CrudRepository<UsuariosPc, Long> {
    @Query(value = "SELECT d FROM UsuariosPc d WHERE d.estado_id = 1000")
    List<UsuariosPc> findAll();

    @Query(value = "SELECT d FROM UsuariosPc d WHERE d.estado_id = 1000 and d.ci = :pCi")
    List<UsuariosPc> verificarUsuario(@Param("pCi") String pCi);

}
