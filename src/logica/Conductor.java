package logica;

public class Conductor {
	private int id;
	private String nombre;
	
	public Conductor(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Conductor [id=" + id + ", nombre=" + nombre + "]";
	}
	
	public void subirGente (Colectivo colectivo) {
		
	}
}
