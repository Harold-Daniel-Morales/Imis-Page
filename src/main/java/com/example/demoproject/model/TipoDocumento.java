package com.example.demoproject.model;

import javax.persistence.*;

@Entity
@Table(name = "tipo_documento")
public class TipoDocumento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column( unique = true, nullable = false)
	private int id_tipo_documento;

	@Column(nullable = false)
	private String nombre_doc;
	
	
	public TipoDocumento()
	{
		
	}


	public int getId_tipo_documento() {
		return id_tipo_documento;
	}


	public void setId_tipo_documento(int id_tipo_documento) {
		this.id_tipo_documento = id_tipo_documento;
	}


	public String getNombre_doc() {
		return nombre_doc;
	}


	public void setNombre_doc(String nombre_doc) {
		this.nombre_doc = nombre_doc;
	}
	
	

}
