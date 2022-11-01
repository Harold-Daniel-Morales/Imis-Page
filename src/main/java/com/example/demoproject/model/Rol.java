package com.example.demoproject.model;

import javax.persistence.*;

@Entity
@Table(name = "rol")
public class Rol {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column( unique = true, nullable = false)
	private int idrol;

	@Column(nullable = false)
	private String Nombrerol;
	
	public Rol()
	{
		
	}

	public int getIdrol() {
		return idrol;
	}

	public void setIdrol(int idrol) {
		this.idrol = idrol;
	}

	public String getNombrerol() {
		return Nombrerol;
	}

	public void setNombrerol(String nombrerol) {
		Nombrerol = nombrerol;
	}

	

}
