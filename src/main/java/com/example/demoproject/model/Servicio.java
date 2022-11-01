package com.example.demoproject.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "servicio")
public class Servicio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column( unique = true, nullable = false)
	private int id_servicios;

	@Column(nullable = false)
	private String nombre_servicio;

	@Column(nullable = false)
	private Double valor_servicio;

	@ManyToOne
	@JoinColumn(name = "fk_IdCliente", nullable = false)
	private Cliente cliente;

	@ManyToOne
	@JoinColumn(name = "fk_id_equipos" , nullable = false)
	private Equipo equipo;
	public Servicio()
	{
		
	}

	public int getId_servicios() {
		return id_servicios;
	}

	public void setId_servicios(int id_servicios) {
		this.id_servicios = id_servicios;
	}

	public String getNombre_servicio() {
		return nombre_servicio;
	}

	public void setNombre_servicio(String nombre_servicio) {
		this.nombre_servicio = nombre_servicio;
	}

	public Double getValor_servicio() {
		return valor_servicio;
	}

	public void setValor_servicio(Double valor_servicio) {
		this.valor_servicio = valor_servicio;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Equipo getEquipo() {
		return equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}
}
