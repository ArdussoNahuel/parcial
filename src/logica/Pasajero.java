package logica;

public class Pasajero {
	private int id;
	private String nombre;
	private int edad;
	private double saldo;
	
	public Pasajero(int id, String nombre, int edad, double saldo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.saldo = saldo;
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

	@Override
	public String toString() {
		return "Pasajero [id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", saldo=" + saldo + "]\n";
	}
	
	
}
