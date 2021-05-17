package aiss.model;

import com.google.appengine.repackaged.org.joda.time.LocalDate;

public class Reminder {
	private String id;
	private LocalDate fecha;
	private String usuario;

	public Reminder(String id, LocalDate fecha, String usuario) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.usuario = usuario;
	}
	public Reminder(String id){
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
}
