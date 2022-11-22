package interfaz;

import java.util.LinkedList;

import javax.swing.JOptionPane;

import logica.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Pasajero> pasajeros = generarPasajeros(new LinkedList<Pasajero>());
		JOptionPane.showMessageDialog(null, mostrarPasajeros(pasajeros));
		System.out.println(mostrarPasajeros(pasajeros));
	}

	public static LinkedList<Pasajero> generarPasajeros (LinkedList<Pasajero> pasajeros){
		int aux=(int) (Math.random()*40+30);
		String []nombre = {"Sofia","Jorge","Carlos","Federico","Daniel","Maria","Pilar","Martin","Franco","Agustina","Irina","Ezequiel","Camila","Sabrina"};
		String []apellido = {"Gonzalez","Fernandez","Rodriguez","Martinez","Perez","Llanos","Rojas","Gutierrez","Dominguez","Bianchini","Velez","Mendez"};
		for (int i=0; i<aux;i++) {
			int nomb=(int) (Math.random()*14);
			int ape=(int) (Math.random()*12);
			pasajeros.add(new Pasajero(pasajeros.size(),nombre[nomb]+" "+apellido[ape],(int)(Math.random()*85),Math.random()*150));
		}
		return pasajeros;
	}
	public static String mostrarPasajeros(LinkedList<Pasajero> lista) {
		String aux="";
		if (lista.isEmpty()) {
		} else {
			for (Pasajero pasajero : lista) {
				aux+=pasajero;
			}
		}
		return aux;
	}
}
