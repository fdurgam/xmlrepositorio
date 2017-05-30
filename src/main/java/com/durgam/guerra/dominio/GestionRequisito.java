package com.durgam.guerra.dominio;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


public class GestionRequisito {
	private static GestionRequisito miapp;
	
	private Long id;
	private String nombre;
	static final String sistema_nombre="Sistema Requisitos 2017";
	
	
	private List<Proyecto> documentos;
	
	//Por Singleton: El constructor es privado, no permite que se genere un constructor por defecto.
	private GestionRequisito() {
		 this.setNombre(sistema_nombre);
		this.documentos=new ArrayList<Proyecto>();
	}

	public static GestionRequisito getSistema() {
	 if (miapp==null) {
		 miapp=new GestionRequisito();
	 }
	 	return miapp;
	 }
	
	public void agregarProyecto(Proyecto documento) {
		this.documentos.add(documento);
		}

	public List<Proyecto> getDocumentos() {
		return documentos;
	}

	public void setDocumentos(List<Proyecto> documentos) {
		this.documentos = documentos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}

