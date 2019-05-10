package com.bolsadeideas.springboot.backend.apirest.models.entity;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="documentos")
public class Documentos  implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long adjunto_id;
    private Long caso_id;
    private String path;
    private String nombre_archivo;
    private Long estado_id;

    public Long getCaso_id() {
        return caso_id;
    }

    public void setCaso_id(Long caso_id) {
        this.caso_id = caso_id;
    }

    public Long getAdjunto_id() {
        return adjunto_id;
    }

    public void setAdjunto_id(Long adjunto_id) {
        this.adjunto_id = adjunto_id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getNombre_archivo() {
        return nombre_archivo;
    }

    public void setNombre_archivo(String nombre_archivo) {
        this.nombre_archivo = nombre_archivo;
    }

    public Long getEstado_id() {
        return estado_id;
    }

    public void setEstado_id(Long estado_id) {
        this.estado_id = estado_id;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    private static final long serialVersionUID = 1L;
}
