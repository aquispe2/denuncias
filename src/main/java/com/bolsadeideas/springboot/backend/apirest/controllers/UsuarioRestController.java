package com.bolsadeideas.springboot.backend.apirest.controllers;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Casos;
import com.bolsadeideas.springboot.backend.apirest.models.entity.UsuarioMovil;
import com.bolsadeideas.springboot.backend.apirest.models.entity.UsuariosPc;
import com.bolsadeideas.springboot.backend.apirest.models.services.IDocumentosService;
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
@RequestMapping("/api/usuario")
public class UsuarioRestController {

    @Autowired
    private IUsuarioPcService usuarioPcService;

    @Autowired
    private IUsuarioMovilService usuarioMovilService;

    @GetMapping("/listarUsuarioPcTodos")
    public List<UsuariosPc> listarUsuarioPc()
    {
        List<UsuariosPc> lst = usuarioPcService.findAll();
        return lst;
    }
    @PostMapping("/insertOrUpdatePc")
    public ResponseEntity<UsuariosPc> insertOrUpdatePc(@RequestBody UsuariosPc usuariosPc) {
        usuariosPc.setEstado_id(1000L);
        usuariosPc.setExtencion("LP");
        return ResponseEntity.ok(usuarioPcService.insertOrUpdate(usuariosPc));
    }
    @DeleteMapping("/deleteUsuarioPc/{usuario_id}")
    public ResponseEntity<?> deleteUsuarioPc(@PathVariable Long usuario_id) {

        UsuariosPc obj = usuarioPcService.findBy(usuario_id);
        obj.setEstado_id(1001L);
        usuarioPcService.insertOrUpdate(obj);

        Map<String, Object> objectMap = new HashMap<>();
        objectMap.put("message", "Se ha eliminado un registro de detalle de inclusión y/o exclusión.");
        objectMap.put("status", 200);
        return new ResponseEntity<>(objectMap, HttpStatus.OK);
    }




    /*@GetMapping("/listarUsuarioMovilTodos")
    public List<UsuarioMovil> ListarUsuarioMovil() {
        return usuarioMovilService.findAll();
    }
    @PostMapping("/addUsuarioMovil")
    public ResponseEntity<UsuarioMovil> createUsuarioMovil(@RequestBody UsuarioMovil usuarioMovil) {
        return ResponseEntity.ok(usuarioMovilService.add(usuarioMovil));
    }*/

}
