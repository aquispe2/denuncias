package com.bolsadeideas.springboot.backend.apirest.models.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="usuarioMovil")
public class UsuarioMovil implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long usuario_id;
    private String ci;
    private String mail;
    private String extencion;
    private String nombre;
    private String paterno;
    private String materno;
    private Long estado_id;

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Long getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(Long usuario_id) {
        this.usuario_id = usuario_id;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getExtencion() {
        return extencion;
    }

    public void setExtencion(String extencion) {
        this.extencion = extencion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public Long getEstado_id() {
        return estado_id;
    }

    public void setEstado_id(Long estado_id) {
        this.estado_id = estado_id;
    }

    private static final long serialVersionUID = 1L;
}
