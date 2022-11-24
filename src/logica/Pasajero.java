package logica;

public class Pasajero {
	private int id;
	private String nombre;
	private int edad;
	private double saldo;
	private int parada;
	private boolean estado;
	
	public Pasajero(int id, String nombre, int edad, double saldo, int parada, boolean estado) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.saldo = saldo;
		this.parada = parada;
		this.estado= estado;
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getParada() {
		return parada;
	}

	public void setParada(int parada) {
		this.parada = parada;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Pasajero nro " + id + ", " + nombre + " de " + edad + " con $" + saldo + "se baja en la parada "
				+ parada + "\n";
	}

	
	
	
}
