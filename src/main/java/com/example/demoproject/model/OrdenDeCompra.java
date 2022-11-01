package com.example.demoproject.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "orden_de_compra")
public class OrdenDeCompra {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column( unique = true, nullable = false)
	private int id_orden_compra;
	@Column(nullable = false)
	private int cantidad;
	@Column(nullable = false)
	private Date fecha_orden_compra;

	@ManyToOne
	@JoinColumn(name = "fk_id_proveedor" , nullable = false)
	private Proveedor proveedor;

	@ManyToOne
	@JoinColumn(name = "fk_idProductos" , nullable = false)
	private Producto producto;

	OrdenDeCompra()
	{
		
	}

	public int getId_orden_compra() {
		return id_orden_compra;
	}

	public void setId_orden_compra(int id_orden_compra) {
		this.id_orden_compra = id_orden_compra;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Date getFecha_orden_compra() {
		return fecha_orden_compra;
	}

	public void setFecha_orden_compra(Date fecha_orden_compra) {
		this.fecha_orden_compra = fecha_orden_compra;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
}
