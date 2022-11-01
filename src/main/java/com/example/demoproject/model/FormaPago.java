package com.example.demoproject.model;

import javax.persistence.*;

@Entity
@Table(name = "formapago")
public class FormaPago {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column( unique = true, nullable = false)
	private int idpago;

	@Column(nullable = false)
	private String tipopago;
	
	FormaPago()
	{
		
	}

	public int getIdpago() {
		return idpago;
	}

	public void setIdpago(int idpago) {
		this.idpago = idpago;
	}

	public String getTipopago() {
		return tipopago;
	}

	public void setTipopago(String tipopago) {
		this.tipopago = tipopago;
	}



}
