package logica;

import java.util.LinkedList;

public class Colectivo {
	private int id;
	private boolean estado;
	private LinkedList<Pasajero> pasajeros;
	private int lleno;
	private double recaudacion;
	
	public Colectivo(int id, boolean estado, LinkedList<Pasajero> pasajeros, int lleno, double recaudacion) {
		super();
		this.id = id;
		this.estado = estado;
		this.pasajeros = pasajeros;
		this.lleno = lleno;
		this.recaudacion = recaudacion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public LinkedList<Pasajero> getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(LinkedList<Pasajero> pasajeros) {
		this.pasajeros = pasajeros;
	}

	public int getLleno() {
		return lleno;
	}

	public void setLleno(int lleno) {
		this.lleno = lleno;
	}

	public double getRecaudacion() {
		return recaudacion;
	}

	public void setRecaudacion(double recaudacion) {
		this.recaudacion = recaudacion;
	}

	@Override
	public String toString() {
		return "Colectivo [id=" + id + ", estado=" + estado + ", pasajeros=" + pasajeros + ", recaudacion="
				+ recaudacion + "]";
	}
	
}
