package com.bolsadeideas.springboot.backend.apirest.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Casos;
import com.bolsadeideas.springboot.backend.apirest.models.services.ICasosService;

import javax.validation.Valid;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/casos")
public class CasosRestController {

	@Autowired
	private ICasosService casosService;

	@GetMapping("/listarTodos")
	public List<Casos> index() {
		return casosService.findAll();
	}

	@PostMapping("/InsertOrUpdate")
	public ResponseEntity<Casos> InsserOrUpdate(@RequestBody Casos casos) {

		return ResponseEntity.ok(casosService.InssertOrUpdate(casos));

	}
	
}
