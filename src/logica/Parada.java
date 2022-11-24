package logica;

public class Parada {
	private int id;
	private String nombre;
	private double popularidad;
	
	public Parada(int id, String nombre, double popularidad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.popularidad = popularidad;
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

	public double getPopularidad() {
		return popularidad;
	}

	public void setPopularidad(double popularidad) {
		this.popularidad = popularidad;
	}

	@Override
	public String toString() {
		return "Parada [id=" + id + ", nombre=" + nombre + ", popularidad=" + popularidad + "]";
	}
	
	
}
