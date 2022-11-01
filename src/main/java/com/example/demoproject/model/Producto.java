package com.example.demoproject.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "producto")
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column( unique = true, nullable = false)
	private int idproductos;

	@Column(nullable = false)
	private String nombreproducto;

	@Column(nullable = false)
	private Double valorproducto;

	@Column(nullable = false)
	private String estadoproducto;

	@Column(nullable = false)
	private int stock;

	@ManyToOne
	@JoinColumn(name = "fk_categoriaProductos" , nullable = false)

	private CategoriaProducto categoriaproducto;


	Producto()
	{
		
	}

	public int getIdproductos() {
		return idproductos;
	}

	public void setIdproductos(int idproductos) {
		this.idproductos = idproductos;
	}

	public String getNombreproducto() {
		return nombreproducto;
	}

	public void setNombreproducto(String nombreproducto) {
		this.nombreproducto = nombreproducto;
	}

	public Double getValorproducto() {
		return valorproducto;
	}

	public void setValorproducto(Double valorproducto) {
		this.valorproducto = valorproducto;
	}

	public String getEstadoproducto() {
		return estadoproducto;
	}

	public void setEstadoproducto(String estadoproducto) {
		this.estadoproducto = estadoproducto;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public CategoriaProducto getCategoriaproducto() {
		return categoriaproducto;
	}

	public void setCategoriaproducto(CategoriaProducto categoriaproducto) {
		this.categoriaproducto = categoriaproducto;
	}
}
