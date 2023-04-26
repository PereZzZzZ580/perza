package co.uniquindio.programacion2.agenda.model;

import java.io.Serializable;
import java.util.Arrays;

public class Contacto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String identificacion;
	private String nombre;
	private String alias;
	private String direccion;
	private String telefono;
	private String email;
	
	private Grupo[] listaGrupos;
	private Reunion[] listaReuniones;
	
	public Contacto(String nombre, String alias, String direccion, String telefono, String email, int numeroGrupos,
			Reunion[] listaReuniones, String identificacion) {
		super();
		this.nombre = nombre;
		this.alias = alias;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
		this.listaGrupos = new Grupo [numeroGrupos];
		this.listaReuniones = listaReuniones;
		this.identificacion = identificacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Grupo[] getListaGrupos() {
		return listaGrupos;
	}

	public void setListaGrupos(Grupo[] listaGrupos) {
		this.listaGrupos = listaGrupos;
	}

	public Reunion[] getListaReuniones() {
		return listaReuniones;
	}

	public void setListaReuniones(Reunion[] listaReuniones) {
		this.listaReuniones = listaReuniones;
	}

	
	
	
	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alias == null) ? 0 : alias.hashCode());
		result = prime * result + ((direccion == null) ? 0 : direccion.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((identificacion == null) ? 0 : identificacion.hashCode());
		result = prime * result + Arrays.hashCode(listaGrupos);
		result = prime * result + Arrays.hashCode(listaReuniones);
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((telefono == null) ? 0 : telefono.hashCode());
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
		Contacto other = (Contacto) obj;
		if (alias == null) {
			if (other.alias != null)
				return false;
		} else if (!alias.equals(other.alias))
			return false;
		if (direccion == null) {
			if (other.direccion != null)
				return false;
		} else if (!direccion.equals(other.direccion))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (identificacion == null) {
			if (other.identificacion != null)
				return false;
		} else if (!identificacion.equals(other.identificacion))
			return false;
		if (!Arrays.equals(listaGrupos, other.listaGrupos))
			return false;
		if (!Arrays.equals(listaReuniones, other.listaReuniones))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (telefono == null) {
			if (other.telefono != null)
				return false;
		} else if (!telefono.equals(other.telefono))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Contacto [identificacion=" + identificacion + ", nombre=" + nombre + ", alias=" + alias + ", direccion="
				+ direccion + ", telefono=" + telefono + ", email=" + email + ", listaGrupos="
				+ Arrays.toString(listaGrupos) + ", listaReuniones=" + Arrays.toString(listaReuniones) + "]";
	}
	
	
	
	
}
