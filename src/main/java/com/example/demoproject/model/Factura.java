package com.example.demoproject.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "factura")
public class Factura {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column( unique = true, nullable = false)
	private int idfactura;
	@Column(nullable = false)
	private Double  totalfactura;
	@Column(nullable = false)
	private Date fecha_registro;

	@ManyToOne
	@JoinColumn(name = "fk_idCliente"  , nullable = false)
	private Cliente cliente;

	@ManyToOne
	@JoinColumn(name = "fk_id_usuario" , nullable = false)
	private Usuario usuario;

	@ManyToOne
	@JoinColumn(name = "fk_idPago" , nullable = false)
	private FormaPago formaPago;


	
	public Factura()
	{
		
	}

	public int getIdfactura() {
		return idfactura;
	}

	public void setIdfactura(int idfactura) {
		this.idfactura = idfactura;
	}

	public Double getTotalfactura() {
		return totalfactura;
	}

	public void setTotalfactura(Double totalfactura) {
		this.totalfactura = totalfactura;
	}

	public Date getFecha_registro() {
		return fecha_registro;
	}

	public void setFecha_registro(Date fecha_registro) {
		this.fecha_registro = fecha_registro;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public FormaPago getFormaPago() {
		return formaPago;
	}

	public void setFormaPago(FormaPago formaPago) {
		this.formaPago = formaPago;
	}
}
