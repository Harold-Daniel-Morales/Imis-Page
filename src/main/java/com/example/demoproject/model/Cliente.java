package com.example.demoproject.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "cliente")
public class Cliente {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column( unique = true, nullable = false)
	private int idcliente;
	@Column(nullable = false)
	private int numdoc;
	@Column(nullable = false)
	private String nombrecliente;
	@Column(nullable = false)
	private String apellidocliente;

	@Column(nullable = false)
	private long telecliente;
	@Column(nullable = false)
	private String emailcliente;

	@ManyToOne
	@JoinColumn(name = "fk_TipoDocumento", nullable = false)
	private TipoDocumento tipoDocumento;
	
	
	public Cliente()
	
	{
		
	}

	public int getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}

	public int getNumdoc() {
		return numdoc;
	}

	public void setNumdoc(int numdoc) {
		this.numdoc = numdoc;
	}

	public String getNombrecliente() {
		return nombrecliente;
	}

	public void setNombrecliente(String nombrecliente) {
		this.nombrecliente = nombrecliente;
	}

	public String getApellidocliente() {
		return apellidocliente;
	}

	public void setApellidocliente(String apellidocliente) {
		this.apellidocliente = apellidocliente;
	}

	public long getTelecliente() {
		return telecliente;
	}

	public void setTelecliente(long telecliente) {
		this.telecliente = telecliente;
	}

	public String getEmailcliente() {
		return emailcliente;
	}

	public void setEmailcliente(String emailcliente) {
		this.emailcliente = emailcliente;
	}

	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
}
