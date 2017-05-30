package com.durgam.guerra.dominio;
import java.util.List;

abstract public class EstadoRequisito {

	public EstadoRequisito() {
		super();
	}

	public EstadoRequisito(Long id, String descripcionEstado) {
		super();
		this.id = id;
		this.descripcionEstado = descripcionEstado;
	}

	
	private Long id;
	private String descripcionEstado;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescripcionEstado() {
		return descripcionEstado;
	}

	public void setDescripcionEstado(String descripcionEstado) {
		this.descripcionEstado = descripcionEstado;
	}

	abstract public List<EstadoRequisito> siguiente();
}
