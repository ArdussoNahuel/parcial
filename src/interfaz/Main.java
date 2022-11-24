package interfaz;

import java.util.LinkedList;

import javax.swing.JOptionPane;

import logica.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Pasajero> pasajeros = generarPasajeros(new LinkedList<Pasajero>());
		LinkedList<Parada> paradas = generarParadas(new LinkedList<Parada>());
		Conductor conductor = new Conductor(1,"Jorge Nitales");
		Colectivo colectivo = new Colectivo(1,false,new LinkedList<Pasajero>(),-1,0);

		System.out.println(mostrarPasajeros(pasajeros));
		menu(pasajeros,paradas,conductor,colectivo,0);
	}
	
	public static void menu (LinkedList<Pasajero> pasajeros, LinkedList<Parada> paradas, Conductor conductor, Colectivo colectivo, int parada) {
		System.out.println("hola");
		String []opciones = {"Ir a la siguiente parada", "Ver pasajeros", "Bajar pasajero" , "Ver recaudacion"};
		if (!colectivo.isEstado()) {
			opciones[0]="Encender colectivo";
			
		}
		if (parada>16) {
			String lleno="";
			if (colectivo.getLleno()>0) {
				lleno="\nEl colectivo se llenó en la parada "+colectivo.getLleno();
			}
			JOptionPane.showMessageDialog(null, "Fin del trayecto, total recaudado: "+colectivo.getRecaudacion()+lleno);
		} else {
			String opcion = (String) JOptionPane.showInputDialog(
					null // para que se muestre centrado
					,"Bienvenido chofer, parada actual: "+paradas.get(parada).getNombre()+"\nPasajeros: "+colectivo.getPasajeros().size()+"\nElija una opcion" // Mensaje de la ventana
					,"Menu de Chofer" // Titulo de la ventana
					,JOptionPane.QUESTION_MESSAGE // Icono
					,null //null para icono defecto de la ventana
					,opciones // el objeto
					,opciones[0] // posicion del que va aparecer seleccionado
					);
			if (opcion==null) {
				
			}else {
				switch (opcion) {
				case "Encender colectivo":
					colectivo.setEstado(true);
					JOptionPane.showMessageDialog(null, "Colectivo encendido");
					menu(pasajeros,paradas,conductor,colectivo,parada);
					break;
				case "Ir a la siguiente parada":
					conductor.parar(colectivo, paradas.get(parada), pasajeros);
					System.out.println("Paró");
					menu(pasajeros,paradas,conductor,colectivo,parada+1);
					break;
				case "Ver pasajeros":
					conductor.verPasajeros(colectivo.getPasajeros());
					menu(pasajeros,paradas,conductor,colectivo,parada);
					break;
				case "Bajar pasajero":
					conductor.bajarGente(conductor.verPasajeros(pasajeros), colectivo);
					menu(pasajeros,paradas,conductor,colectivo,parada);
					break;
				case "Ver recaudación":
					JOptionPane.showMessageDialog(null, "El colectivo ha recaudado: $"+colectivo.getRecaudacion());
					menu(pasajeros,paradas,conductor,colectivo,parada);
					break;
				default:
					break;
				}
			}
		}
		
		
	}

	public static LinkedList<Pasajero> generarPasajeros (LinkedList<Pasajero> pasajeros){
		int aux=(int) (Math.random()*40+150);
		String []nombre = {"Sofia","Jorge","Carlos","Federico","Daniel","Maria","Pilar","Martin","Franco","Agustina","Irina","Ezequiel","Camila","Sabrina"};
		String []apellido = {"Gonzalez","Fernandez","Rodriguez","Martinez","Perez","Llanos","Rojas","Gutierrez","Dominguez","Bianchini","Velez","Mendez"};
		for (int i=0; i<aux;i++) {
			int nomb=(int) (Math.random()*14);
			int ape=(int) (Math.random()*12);
			pasajeros.add(new Pasajero(pasajeros.size(),nombre[nomb]+" "+apellido[ape],(int)(Math.random()*85),Math.random()*150,(int)(Math.random()*17),true));
		}
		return pasajeros;
	}
	
	public static LinkedList<Parada> generarParadas (LinkedList<Parada> paradas){
		paradas.add(new Parada(0,"Rosas",0.5));
		paradas.add(new Parada(1,"Echeverria",0.5));
		paradas.add(new Parada(2,"De los Incas",0.5));
		paradas.add(new Parada(3,"Tronador",0.5));
		paradas.add(new Parada(4,"Lacroze",0.5));
		paradas.add(new Parada(5,"Dorrego",0.5));
		paradas.add(new Parada(6,"Malabia",0.5));
		paradas.add(new Parada(7,"Angel Gallardo",0.5));
		paradas.add(new Parada(8,"Medrano",0.5));
		paradas.add(new Parada(9,"Carlos Gardel",0.5));
		paradas.add(new Parada(10,"Pueyrredon",0.5));
		paradas.add(new Parada(11,"Pasteur",0.5));
		paradas.add(new Parada(12,"Callao",0.5));
		paradas.add(new Parada(13,"Uruguay",0.5));
		paradas.add(new Parada(14,"Carlos Pellegrini",0.5));
		paradas.add(new Parada(15,"Florida",0.5));
		paradas.add(new Parada(16,"Leandro N Alem",0.5));
		return paradas;
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
