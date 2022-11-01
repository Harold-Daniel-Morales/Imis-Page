package com.example.demoproject.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "detalle_por_factura")
public class DetallePorFactura {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column( unique = true, nullable = false)
	private int iddetalle;
	@Column(nullable = false)
	private int cantidaddetalle;
	@Column(nullable = false)
	private Double valorunitario;
	@Column(nullable = false)
	private Double iva;
	@Column(nullable = false)
	private Double subtotal;
	@Column(nullable = false)
	private Double totalgeneral;

	@ManyToOne
	@JoinColumn(name = "fk_idFactura" , nullable = false)
	@JsonBackReference
	private Factura factura;

	@ManyToOne
	@JoinColumn(name = "fk_IdProductos" , nullable = false)
	@JsonBackReference
	private Producto producto;


	public DetallePorFactura()
	
	{
	
	}

	public int getIddetalle() {
		return iddetalle;
	}

	public void setIddetalle(int iddetalle) {
		this.iddetalle = iddetalle;
	}

	public int getCantidaddetalle() {
		return cantidaddetalle;
	}

	public void setCantidaddetalle(int cantidaddetalle) {
		this.cantidaddetalle = cantidaddetalle;
	}

	public Double getValorunitario() {
		return valorunitario;
	}

	public void setValorunitario(Double valorunitario) {
		this.valorunitario = valorunitario;
	}

	public Double getIva() {
		return iva;
	}

	public void setIva(Double iva) {
		this.iva = iva;
	}

	public Double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}

	public Double getTotalgeneral() {
		return totalgeneral;
	}

	public void setTotalgeneral(Double totalgeneral) {
		this.totalgeneral = totalgeneral;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
}
