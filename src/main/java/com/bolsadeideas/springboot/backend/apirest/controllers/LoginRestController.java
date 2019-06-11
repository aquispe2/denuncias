package com.bolsadeideas.springboot.backend.apirest.controllers;

import com.bolsadeideas.springboot.backend.apirest.models.entity.UsuarioMovil;
import com.bolsadeideas.springboot.backend.apirest.models.entity.UsuariosPc;
import com.bolsadeideas.springboot.backend.apirest.models.services.IUsuarioMovilService;
import com.bolsadeideas.springboot.backend.apirest.models.services.IUsuarioPcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/login")
public class LoginRestController {
    @Autowired
    private IUsuarioPcService usuarioPcService;

    @Autowired
    private IUsuarioMovilService usuarioMovilService;

    @PostMapping("/verificarUsuario")
    public ResponseEntity<?> verificarUsuario(@RequestBody UsuariosPc usuariosPc) {
        Map<String, Object> objectMap = new HashMap<>();
        try{

            List<UsuariosPc>  lstUsuario =  usuarioPcService.verificarUsuario(usuariosPc.getCi());
            if(lstUsuario!=null && lstUsuario.size()>0){
                objectMap.put("result",lstUsuario.get(0));
                objectMap.put("message", "Usuario Autenticado Exitosamente.");
                objectMap.put("status", 200);
                return new ResponseEntity<>(objectMap, HttpStatus.OK);
            }else{
                objectMap.put("message", "Usuario No Existe.");
                objectMap.put("status", 400);
                return new ResponseEntity<>(objectMap, HttpStatus.NOT_FOUND);
            }

        }catch (Exception ex){
            objectMap.put("message", ex.toString());
            objectMap.put("status", 400);
            return new ResponseEntity<>(objectMap, HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/verificarUsuarioMovil")
    public ResponseEntity<?> verificarUsuarioMovil(@RequestBody UsuarioMovil usuarioMovil) {
        Map<String, Object> objectMap = new HashMap<>();
        try{
            System.out.println("CI: "+usuarioMovil.getCi());
            System.out.println("Mail: "+usuarioMovil.getMail());
            System.out.println("==============================");
            List<UsuarioMovil>  lstUsuario =  usuarioMovilService.verificarUsuarioMovil(usuarioMovil.getCi(),usuarioMovil.getMail());
            if(lstUsuario!=null && lstUsuario.size()>0){
                objectMap.put("result",lstUsuario.get(0));
                objectMap.put("message", "Usuario Autenticado Exitosamente.");
                objectMap.put("status", 200);
                return new ResponseEntity<>(objectMap, HttpStatus.OK);
            }else{
                objectMap.put("message", "Usuario No Existe.");
                objectMap.put("status", 400);
                return new ResponseEntity<>(objectMap, HttpStatus.NOT_FOUND);
            }

        }catch (Exception ex){
            objectMap.put("message", ex.toString());
            objectMap.put("status", 400);
            return new ResponseEntity<>(objectMap, HttpStatus.NOT_FOUND);
        }
    }
}
