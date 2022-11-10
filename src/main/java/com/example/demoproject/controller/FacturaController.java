package com.example.demoproject.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demoproject.model.Factura;
import com.example.demoproject.service.FacturaService;

@CrossOrigin(origins ="*")
@RestController
@RequestMapping("/api")
public class FacturaController {
	
	@Autowired
	FacturaService facturaService;
	
	@GetMapping("/factura/listar")
	public List<Factura> lsit()
	{
		return facturaService.listAllFactura();
	}
	
	@GetMapping("/factura/listar/{id}")
	public ResponseEntity<Factura> get(@PathVariable Integer id)
	{
		try
		{
			Factura factura = facturaService.getFactura(id);
			return new ResponseEntity<Factura>(factura, HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<Factura>(HttpStatus.NOT_FOUND);
		}
	}
	@PostMapping("/factura/guardar")
	public void add(@RequestBody Factura factura)
	{
		facturaService.guardarFactura(factura);
	}
	@PutMapping("/factura/actualizar/{id}")
	public ResponseEntity<?> update(@RequestBody Factura factura, @PathVariable Integer id)
	{
		try
		{
			Factura existeFactura = facturaService.getFactura(id);
			factura.setIdfactura(id);
			facturaService.guardarFactura(factura);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	@DeleteMapping("/factura/eliminar/{id}")
	public void delete (@PathVariable Integer id)
	{
		facturaService.eliminarFactura(id);
	}
	

}
