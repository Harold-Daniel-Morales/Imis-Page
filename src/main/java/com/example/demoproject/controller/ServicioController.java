package com.example.demoproject.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demoproject.model.Rol;
import com.example.demoproject.model.Servicio;
import com.example.demoproject.service.RolService;
import com.example.demoproject.service.ServicioService;

@CrossOrigin(origins ="*")
@RestController
@RequestMapping("/api")
public class ServicioController {
	
	@Autowired
	ServicioService servicioService;
	
	@GetMapping("/servicio/listar")
	public List<Servicio> list()
	{
		return servicioService.listAllServicio();
	}
	
	@GetMapping("/servicio/listar/{id}")
	public ResponseEntity<Servicio> get(@PathVariable Integer id)
	{
		try
		{
			
			Servicio servicio = servicioService.getServicio(id);
			return new ResponseEntity<Servicio>(servicio, HttpStatus.OK );
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<Servicio>(HttpStatus.NOT_FOUND);
		}
	}
	@PostMapping("/servicio/guardar")
	public void add(@RequestBody Servicio servicio)
	{
		servicioService.guardarServicio(servicio);
	}
	
	@PutMapping("/servicio/actualizar/{id}")
	public ResponseEntity<?> update(@RequestBody Servicio servicio, @PathVariable Integer id)
	{
		try
		{
			Servicio existeServicio = servicioService.getServicio(id);
			servicio.setId_servicios(id);
			servicioService.guardarServicio(servicio);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(NoSuchElementException e)
	{
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	
}
	@DeleteMapping("/servicio/eliminar/{id}")
	public void delete (@PathVariable Integer id)
	{
		servicioService.eliminarServicio(id);
	}


}
