package Actuacion;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import ciudad.Persona;

public class Main {

	public static void main(String[] args) {
		/**
		 * @author Mauricio Diaz Araneda
		 * Documentando prueba
		 */
		//Crear una actuacion por programacion
		
		Actuacion a1 = new Actuacion();
		a1.setNombreGrupo("Black Sabbath");
		a1.setDuracion(110);
		
		//Crear una actuacion con inputs del teclado
		Actuacion a2 = new Actuacion();
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un nombre de grupo");
		a2.setNombreGrupo(scan.nextLine());
		System.out.println("Introduce la duracion de la actuacion en min");
		a2.setDuracion(Integer.parseInt(scan.nextLine()));
		
		//Crear una actuacion desde fichero
		File fichero = new File("D:/actuaciones.txt");
		Actuacion a3 = new Actuacion();
		Scanner scanf = null;
		try {
			scanf = new Scanner(fichero);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		while(scanf.hasNextLine()){
			String linea = scanf.nextLine();
			String partes [] = linea.split(":");
			
			a3.setNombreGrupo(partes[0]);
			a3.setDuracion(Integer.parseInt(partes[1]));
		}
		
		//crear un festival por programacion con 3 actuaciones
		Festival f1 = new Festival();
		f1.setPatricionador("festival one");
		f1.setNombre("The festival");
		
		ArrayList <Actuacion> listaActuaciones = new ArrayList();
		
		listaActuaciones.add(a1);
		listaActuaciones.add(a2);
		listaActuaciones.add(a3);
		
		Actuacion a4 = new Actuacion();
		a4.setNombreGrupo("Pantera");
		a4.setDuracion(30);
		listaActuaciones.add(a4);		
		
		f1.setActuaciones(listaActuaciones);
		f1.addActuacion("Marilyn Manson", 160);
		
		f1.setActuaciones(listaActuaciones);
		f1.addActuacion("El lokillo", 65);
		
		f1.mostrarInfo();
		
		
		}
	
	
	}


