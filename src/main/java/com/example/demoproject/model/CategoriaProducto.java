package com.example.demoproject.model;

import javax.persistence.*;

@Entity
@Table(name = "categoriaproducto")
public class CategoriaProducto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column( unique = true, nullable = false)
	private int id_categoriaproductos;
	@Column(nullable = false)
	private String nom_categoria;	
	
	public CategoriaProducto()
	
	{
		
	}

	public int getId_categoriaproductos() {
		return id_categoriaproductos;
	}

	public void setId_categoriaproductos(int id_categoriaproductos) {
		this.id_categoriaproductos = id_categoriaproductos;
	}

	public String getNom_categoria() {
		return nom_categoria;
	}

	public void setNom_categoria(String nom_categoria) {
		this.nom_categoria = nom_categoria;
	}


}
