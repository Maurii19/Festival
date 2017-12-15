package Actuacion;

import java.util.ArrayList;

public class Actuacion {


		
		private String nombreGrupo;
		private int duracion;
		
		
		public Actuacion(){
			
		}
		public String getNombreGrupo() {
			return nombreGrupo;
		}
		public void setNombreGrupo(String nombreGrupo) {
			this.nombreGrupo = nombreGrupo;
		}
		public int getDuracion() {
			return duracion;
		}
		public void setDuracion(int duracion) {
			this.duracion = duracion;
		}
		public void add(ArrayList<Actuacion> listaArrayList) {
			// TODO Auto-generated method stub
			
		}
		public String getInfo(){
			String info = "El nombre del grupo " + this.getNombreGrupo() + " " + "y su duracion en min: " + this.getDuracion();
			return info;
		}
	
		
		
		
		
	}


