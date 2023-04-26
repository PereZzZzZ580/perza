package co.uniquindio.programacion2.agenda.model;

import java.io.Serializable;

public class Agenda implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String nombre;
	public Contacto [] listaContactos;
	public Grupo [] listaGrupos;
	public Reunion [] listaReuniones;
	
	public Agenda(String nombre, int numeroContacto, int numeroGrupos, int numeroReuniones) {
		super();
		this.nombre = nombre;
		this.listaContactos = new Contacto [numeroContacto];
		this.listaGrupos = new Grupo [numeroGrupos];
		this.listaReuniones = new Reunion [numeroReuniones];
	}
	
	public Agenda() {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Contacto[] getListaContactos() {
		return listaContactos;
	}

	public void setListaContactos(Contacto[] listaContactos) {
		this.listaContactos = listaContactos;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
		Agenda other = (Agenda) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Agenda [nombre=" + nombre + "]";
	}
	
	public void aniadirContacto(Contacto newContacto) throws Exception{
		
		Contacto contacto = buscarContacto(newContacto);
		int posDisponible=0;
		
		if(contacto != null){
			throw new Exception("El contacto ya existe");
		}
			posDisponible = obtenerPosicion();
			
			if(posDisponible == -1){
				throw new Exception("sgenda llena");
			}
			listaContactos[posDisponible] = newContacto;
		}

	private int obtenerPosicion() {
		int posicion = -1;
		for (int i = 0 ; i<listaContactos.length ; i++) {
			if(listaContactos[i] == null){
				posicion = i;				
			}
			break;
		}
		return posicion;
	}

	private Contacto buscarContacto(Contacto newContacto) {
		
		Contacto contactoEncontrado = null;
		
		for (Contacto contacto : listaContactos) {
			if(contacto.equals(newContacto)){
				contactoEncontrado = contacto;
				break;
			}
		}
		return contactoEncontrado;
	}
	
	private boolean verificarExisteContacto(Contacto probarcontacto){
		
		boolean verificar = false;
		
		for (Contacto contacto : listaContactos) {
			if(contacto.getIdentificacion().equals(probarcontacto.getIdentificacion()));
			verificar = true;
		}
		
		return verificar;
	}
	
	private String buscarContactoPorNombre(String nombreContacto){
		
		String telefono = "";
		
		for (Contacto contacto : listaContactos) {
			if(contacto.getNombre().equals(nombreContacto)){
				nombre = contacto.getTelefono();
			}
		}
		
		return telefono;
		
	}
	
	private String eliminarContacto(String identificacion){
		
		String msj = "el contacto no ha sido eliminado";
		
		for(int i =0 ; i<listaContactos.length ; i++){
			
			if(listaContactos[i].getIdentificacion().equals(identificacion)){
				listaContactos[i] = null;
				
				msj = "el contacto ha sido eliminado";
			}
			
		}
		return msj;
	}
	
	 public boolean agendaLlena() {
	        return this.listaContactos.length >= 10;
	    }
	
	 
	 public int huecosLibres() {
	        return 10 - this.listaContactos.length;
	    }
	 
	 
	 public void listarContactos() {
	        System.out.println("Lista de contactos:");
	        for (Contacto contacto : listaContactos) {
	            System.out.println(contacto);
	        }
	    }
}
