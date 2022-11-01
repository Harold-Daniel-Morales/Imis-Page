package com.example.demoproject.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name="usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column( unique = true, nullable = false)
	private int id_usuario;

	@Column(nullable = false)
	private long numdocumento;

	@Column(nullable = false)
	private String nomusuario;

	@Column(nullable = false)
	private String apeusuario;

	@Column(nullable = false)
	private long telusuario;

	@Column(nullable = false)
	private String emailusuario;

	@Column(nullable = false)
	private String passusuario;

	@Column(nullable = false)
	private String estadousuario;

	@ManyToOne
	@JoinColumn(name = "fk_TipoDocumento" , nullable = false)
	private TipoDocumento tipoDocumento;

	@ManyToOne
	@JoinColumn(name = "fk_idRol" , nullable = false)
	private Rol rol;
	
	public Usuario()
	{
		
	}

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	public long getNumdocumento() {
		return numdocumento;
	}

	public void setNumdocumento(long numdocumento) {
		this.numdocumento = numdocumento;
	}

	public String getNomusuario() {
		return nomusuario;
	}

	public void setNomusuario(String nomusuario) {
		this.nomusuario = nomusuario;
	}

	public String getApeusuario() {
		return apeusuario;
	}

	public void setApeusuario(String apeusuario) {
		this.apeusuario = apeusuario;
	}

	public long getTelusuario() {
		return telusuario;
	}

	public void setTelusuario(long telusuario) {
		this.telusuario = telusuario;
	}

	public String getEmailusuario() {
		return emailusuario;
	}

	public void setEmailusuario(String emailusuario) {
		this.emailusuario = emailusuario;
	}

	public String getPassusuario() {
		return passusuario;
	}

	public void setPassusuario(String passusuario) {
		this.passusuario = passusuario;
	}

	public String getEstadousuario() {
		return estadousuario;
	}

	public void setEstadousuario(String estadousuario) {
		this.estadousuario = estadousuario;
	}

	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}
}
