package Actuacion;

import java.util.ArrayList;
import java.util.Iterator;

public class Festival {


		private String nombre;
		private String patricionador;
		ArrayList <Actuacion> actuaciones;
		
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getPatricionador() {
			return patricionador;
		}
		public void setPatricionador(String patricionador) {
			this.patricionador = patricionador;
		}
		public ArrayList<Actuacion> getActuaciones() {
			return actuaciones;
		}
		public void setActuaciones(ArrayList<Actuacion> actuaciones) {
			this.actuaciones = actuaciones;
		}
		public void addActuacion(Actuacion a){
			this.actuaciones.add(a);
		}
		public void addActuacion(String nombre, int duracion){
			Actuacion a = new Actuacion();
			a.setNombreGrupo(nombre);
			a.setDuracion(duracion);
			
			this.actuaciones.add(a);
		}
		public void mostrarInfo(){
			System.out.println(this.getNombre());
			System.out.println("Patrocinado por " + this.getPatricionador());
			System.out.println("--------");
			
			Iterator<Actuacion> i = this.actuaciones.iterator();
			
			while(i.hasNext()){
			Actuacion a = i.next();
			String infoActuacion = a.getInfo();		
			System.out.println(infoActuacion);
	
		}
			
		}
		
	}


