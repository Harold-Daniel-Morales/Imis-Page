package com.example.demoproject.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demoproject.model.Producto;
import com.example.demoproject.service.ProductoService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/api")
public class ProductoController {
	
	@Autowired
	ProductoService productoService;
	
	@GetMapping("/producto/listar")
	public List<Producto> list()
	{
		return productoService.listAllProducto();
	}
	
	@GetMapping("/producto/listar/{id}")
	public ResponseEntity<Producto> get(@PathVariable Integer id)
	{
		try
		{
			Producto producto = productoService.getProducto(id);
			return new ResponseEntity<Producto>(producto, HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<Producto>(HttpStatus.NOT_FOUND);
		}
	}
	@PostMapping("/producto/guardar")
	public void add(@RequestBody Producto producto)
	{
		productoService.guardarProducto(producto);
	}
	
	@PutMapping("/producto/actualizar/{id}")
	public ResponseEntity<?> update(@RequestBody Producto producto, @PathVariable Integer id)
	{
		try
		{
			Producto existeProducto= productoService.getProducto(id);
			producto.setIdproductos(id);
			productoService.guardarProducto(producto);
			return new ResponseEntity<>(HttpStatus.OK);
			
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/producto/eliminar/{id}")
	public void delete (@PathVariable Integer id)
	{
		productoService.eliminarProducto(id);
	}


}
