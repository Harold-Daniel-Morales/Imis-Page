package com.example.demoproject.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "proveedor")
public class Proveedor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column( unique = true, nullable = false)
	private int id_proveedor;

	@Column(nullable = false)
	private int numero_documento;

	@Column(nullable = false)
	private String nombre_proveedor;

	@Column(nullable = false)
	private String apellido_proveedor;

	@Column(nullable = false)
	private String email_proveedor;

	@Column(nullable = false)
	private Date fecha_creado_proveedor;

	@ManyToOne
	@JoinColumn(name = "fk_TipoDocumento" , nullable = false)

	private TipoDocumento tipoDocumento;


	Proveedor()
	{
		
	}

	public int getId_proveedor() {
		return id_proveedor;
	}



	public void setId_proveedor(int id_proveedor) {
		this.id_proveedor = id_proveedor;
	}



	public int getNumero_documento() {
		return numero_documento;
	}



	public void setNumero_documento(int numero_documento) {
		this.numero_documento = numero_documento;
	}



	public String getNombre_proveedor() {
		return nombre_proveedor;
	}



	public void setNombre_proveedor(String nombre_proveedor) {
		this.nombre_proveedor = nombre_proveedor;
	}



	public String getApellido_proveedor() {
		return apellido_proveedor;
	}



	public void setApellido_proveedor(String apellido_proveedor) {
		this.apellido_proveedor = apellido_proveedor;
	}



	public String getEmail_proveedor() {
		return email_proveedor;
	}



	public void setEmail_proveedor(String email_proveedor) {
		this.email_proveedor = email_proveedor;
	}



	public Date getFecha_creado_proveedor() {
		return fecha_creado_proveedor;
	}



	public void setFecha_creado_proveedor(Date fecha_creado_proveedor) {
		this.fecha_creado_proveedor = fecha_creado_proveedor;
	}

	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
}
