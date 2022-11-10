package com.example.demoproject.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demoproject.model.Usuario;
import com.example.demoproject.repository.UsuarioRepository;
import com.example.demoproject.service.UsuarioService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/api")
public class UsuarioController {
	
	@Autowired
	UsuarioService usuarioService;
	
	@GetMapping("/usuario/listar")
	
	public List<Usuario> list()
	{
		return usuarioService.listAllUsuario();
	}
	
	@GetMapping("/usuario/listar/{id}")
	public ResponseEntity<Usuario> get(@PathVariable Integer id)
	{
		try
		{
			Usuario usuario = usuarioService.getUsuario(id);
			return new ResponseEntity<Usuario>(usuario, HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<Usuario>(HttpStatus.NOT_FOUND);
		}
	}
	@PostMapping("/usuario/guardar")
	public void add(@RequestBody Usuario usuario)
	{
		usuarioService.guardarUsuario(usuario);
	}
	
	@PutMapping("/usuario/actualizar/{id}")
	public ResponseEntity<?> update(@RequestBody Usuario usuario, @PathVariable Integer id)
	{
		try
		{
			Usuario existeUsuario = usuarioService.getUsuario(id);
			usuario.setId_usuario(id);
			usuarioService.guardarUsuario(usuario);
			return new ResponseEntity<>(HttpStatus.OK);
			
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/usuario/eliminar/{id}")
	public void delete (@PathVariable Integer id)
	{
		usuarioService.eliminarUsuario(id);
	}

}
