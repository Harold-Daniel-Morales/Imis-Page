package com.example.demoproject.model;



import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "equipo")
public class Equipo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column( unique = true, nullable = false)
	private int id_equipos;
	@Column(nullable = false)
	private String marca;
	@Column(nullable = false)
	private int cantidad;
	@Column(nullable = false)
	private Date fecha_entrega;
	@Column(nullable = false)
	private String estado;
	
	public Equipo()
	{
		
	}

	public int getId_equipos() {
		return id_equipos;
	}

	public void setId_equipos(int id_equipos) {
		this.id_equipos = id_equipos;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Date getFecha_entrega() {
		return fecha_entrega;
	}

	public void setFecha_entrega(Date fecha_entrega) {
		this.fecha_entrega = fecha_entrega;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}


	

}
