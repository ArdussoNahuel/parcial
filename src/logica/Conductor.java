package logica;

import java.util.LinkedList;

import javax.swing.JOptionPane;

import logica.*;

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
	
	public void parar (Colectivo colectivo, Parada parada, LinkedList<Pasajero> pasajeros) {
		int suben = (int)(Math.random()*35);
		for (int i=0;i<colectivo.getPasajeros().size();i++) {
			if (colectivo.getPasajeros().get(i).getParada()==parada.getId()+1) {
				this.bajarGente(colectivo.getPasajeros().get(i), colectivo);
			}
		}
		for (int i=0;i<suben;i++) {
			if (colectivo.getPasajeros().size()==50) {
				JOptionPane.showMessageDialog(null, "Colectivo lleno, no se subirán más pasajeros");
				colectivo.setLleno(parada.getId());
				i=suben;
			} else {
				for (int j=0;j<pasajeros.size();j++) {
					if (pasajeros.get(j).getParada()>parada.getId() && pasajeros.get(j).isEstado()) {
						subirGente(pasajeros.get(j),colectivo, parada);
						pasajeros.get(j).setEstado(false);
						j=pasajeros.size();
					}
				}
			}
		}
		
	}
	
	public void bajarGente (Pasajero pasajero, Colectivo colectivo) {
		colectivo.getPasajeros().remove(pasajero);
		JOptionPane.showMessageDialog(null, pasajero.getNombre()+" se bajó");
		System.out.println("Termina la funcion");
	}
	
	public void subirGente (Pasajero pasajero, Colectivo colectivo, Parada parada) {
		double precio = 25 + 2.5*(pasajero.getParada()-parada.getId());
		if (pasajero.getEdad()<18 || pasajero.getEdad()>60) {
			precio/=2;
		}
		if (pasajero.getSaldo()<precio) {
			JOptionPane.showMessageDialog(null, "El pasajero "+pasajero.getNombre()+" no tiene saldo suficiente ($"+pasajero.getSaldo()+") para pagar el viaje ($"+precio+")");
		} else {
			JOptionPane.showMessageDialog(null, "El pasajero "+pasajero.getNombre()+" se sube al colectivo pagando $"+precio);
			colectivo.getPasajeros().add(pasajero);
			pasajero.setSaldo(pasajero.getSaldo()-precio);
			colectivo.setRecaudacion(colectivo.getRecaudacion()+precio);
		}
	}
	
	public Pasajero verPasajeros (LinkedList<Pasajero> pasajeros) {
		String []aux= new String[pasajeros.size()+1];
		aux[0]="Volver al menu";
		if (pasajeros.isEmpty()) {
			JOptionPane.showMessageDialog(null, "No hay pasajeros");
		} else {
			for (int i=0;i<pasajeros.size();i++) {
				aux[i+1]=pasajeros.get(i).toString();
			}
			String opcion = (String) JOptionPane.showInputDialog(
					null // para que se muestre centrado
					,"Elija un pasajero" // Mensaje de la ventana
					,"Pasajeros del colectivo" // Titulo de la ventana
					,JOptionPane.QUESTION_MESSAGE // Icono
					,null //null para icono defecto de la ventana
					,aux // el objeto
					,aux[0] // posicion del que va aparecer seleccionado
					);
			for (Pasajero pasajero : pasajeros) {
						if (pasajero.toString().equals(opcion)) {
							return pasajero;
						}
			}
		}
		return null;
	}
}
