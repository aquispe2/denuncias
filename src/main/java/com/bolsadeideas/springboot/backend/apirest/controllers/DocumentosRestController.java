package com.bolsadeideas.springboot.backend.apirest.controllers;

import com.bolsadeideas.springboot.backend.apirest.commons.Constantes;
import com.bolsadeideas.springboot.backend.apirest.commons.Utils;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Documentos;
import com.bolsadeideas.springboot.backend.apirest.models.services.IDocumentosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.Map;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/Documentos")
public class DocumentosRestController {

    @Autowired
    private IDocumentosService documentosService;

    @PostMapping("/uploadFile")
    public ResponseEntity<?> uploadFile(@RequestParam("pArchivos") MultipartFile pArchivos,
                                        @RequestParam(value = "pCasoId") Long pCasoId) {

        Boolean result =  Utils.grabarFichero(pArchivos,pArchivos.getOriginalFilename());
        if(result){
            Documentos documentos = new Documentos();
            documentos.setEstado_id(1000L);
            documentos.setNombre_archivo(pArchivos.getOriginalFilename());
            documentos.setPath(Constantes.PATH);
            documentos.setCaso_id(pCasoId);
            documentosService.add(documentos);
        }

        Map<String, Object> objectMap = new HashMap<>();
        objectMap.put("respuesta", "Se ha Registrado Documentos Correctamente");
        objectMap.put("status", 200);
        return new ResponseEntity<>(objectMap, HttpStatus.OK);
    }
}
