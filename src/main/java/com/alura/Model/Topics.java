package com.alura.Model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Topics {

	private Long id;
	private String titulo;
	private String mensaje;
	private LocalDateTime fechaCreacion = LocalDateTime.now();
	private TopicsStatus status = TopicsStatus.NO_RESPONDIDO;
	private User autor;
	private Lecture curso;
	private List<Response> respuestas = new ArrayList<>();

	public Topics(String titulo, String mensaje, Lecture curso) {
		this.titulo = titulo;
		this.mensaje = mensaje;
		this.curso = curso;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Topics other = (Topics) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public LocalDateTime getfechaCreacion() {
		return fechaCreacion;
	}

	public void setfechaCreacion(LocalDateTime fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public TopicsStatus getStatus() {
		return status;
	}

	public void setStatus(TopicsStatus status) {
		this.status = status;
	}

	public User getAutor() {
		return autor;
	}

	public void setAutor(User autor) {
		this.autor = autor;
	}

	public Lecture getCurso() {
		return curso;
	}

	public void setCurso(Lecture curso) {
		this.curso = curso;
	}

	public List<Response> getRespuestas() {
		return respuestas;
	}

	public void setRespuestas(List<Response> respuestas) {
		this.respuestas = respuestas;
	}

}