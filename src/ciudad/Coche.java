package ciudad;

import java.util.Scanner;

public class Coche {
	
	Scanner lector = new Scanner(System.in);
	//constantes precio gasoil y gasolina
	public static final double PRCIO_GASOLINA = 1.39;
	public static final double PRCIO_GASOIL = 1.12;
	
	//atributos private
	private Persona conductor;
	private String color;
	private String matricula;
	private int anioMatricula;
	private String marca;
	private String modelo;
	private int num_puertas;
	private int num_plazas;
	private int  tamanio_maletero;
	private int caballos;
	private double litrosCombustible;
	private boolean esGasolina;
	private int capacidadCombustible;
	private int marcha;
	private int marchaMax;
	private int velocidad;
	private int kilometraje;
	private double consumoMedio; //por 100 kms
	private double precioCompra;
	

	//funciones
	/*
	 * 
	 *getters y setters
	 *
	 *void repostar (int euros)
	 //el litro de gasoil esta a 1,12 y la gasolina 1,39
	  acelerar (int kmHora)
	  cambiarMarcha(boolean mas)
	  circular (int kms)
	  double valorar()
	  //se valora con el kilometraje por 20000km 100 euros y amioMatriculacion por 1 anio 500 euros
	  
	 */


	//getters y setters
	
	public Coche(){
		
	}
	
	
	public double repostar (int euros){
		double repostable;
		double precioCombustible;
		
		System.out.println("Repostando...");
		
		if(this.isEsGasolina()){
			precioCombustible = PRCIO_GASOLINA;
			repostable = euros / this.PRCIO_GASOLINA;
		}else{
			precioCombustible = PRCIO_GASOIL;
			repostable = euros / this.PRCIO_GASOIL;
		}
		
		
		if(repostable + this.getLitrosCombustible() <= this.getCapacidadCombustible()){
			this.setLitrosCombustible(this.getLitrosCombustible() + repostable);
			return 0;
		}else{
			double repostableNuevo = this.getCapacidadCombustible() - this.getLitrosCombustible();
			this.setLitrosCombustible(this.getCapacidadCombustible());
			
			double sobrante = repostable - repostableNuevo;
			double devolucion = sobrante * precioCombustible;
			return devolucion;
		}
		
	}
		
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public void acelerar (int kmHora){
		velocidad = velocidad + kmHora;
	}
	
	public void circular (int kms){
		kilometraje = kilometraje + kms;
	}
	
	public double valorar(int vkm, int valor ){
		if (kilometraje >= vkm ){
			valor = valor - 100;
		}
		
		return valor;
		
	}
	
	public Persona getConductor() {
		return conductor;
	}
	public void setConductor(Persona conductor) {
		this.conductor = conductor;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getAnioMatricula() {
		return anioMatricula;
	}
	public void setAnioMatricula(int anioMatricula) {
		this.anioMatricula = anioMatricula;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getNum_puertas() {
		return num_puertas;
	}
	public void setNum_puertas(int num_puertas) {
		this.num_puertas = num_puertas;
	}
	public int getNum_plazas() {
		return num_plazas;
	}
	public void setNum_plazas(int num_plazas) {
		this.num_plazas = num_plazas;
	}
	public int getTamanio_maletero() {
		return tamanio_maletero;
	}
	public void setTamanio_maletero(int tamanio_maletero) {
		this.tamanio_maletero = tamanio_maletero;
	}
	public int getCaballos() {
		return caballos;
	}
	public void setCaballos(int caballos) {
		this.caballos = caballos;
	}
	

	public double getLitrosCombustible() {
		return litrosCombustible;
	}

	public void setLitrosCombustible(double litrosCombustible) {
		this.litrosCombustible = litrosCombustible;
	}

	public boolean isEsGasolina() {
		return esGasolina;
	}

	public void setEsGasolina(boolean esGasolina) {
		this.esGasolina = esGasolina;
	}

	public int getCapacidadCombustible() {
		return capacidadCombustible;
	}
	public void setCapacidadCombustible(int capacidad) {
		this.capacidadCombustible = capacidad;
	}
	public int getMarcha() {
		return marcha;
	}
	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}
	public int getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	public int getKilometraje() {
		return kilometraje;
	}
	public void setKilometraje(int kilometraje) {
		this.kilometraje = kilometraje;
	}
	public double getConsumoMedio() {
		return consumoMedio;
	}
	public void setConsumoMedio(int consumoMedio) {
		this.consumoMedio = consumoMedio;
	}
	public double getPrecioCompra() {
		return precioCompra;
	}
	public void setPrecioCompra(int precioCompra) {
		this.precioCompra = precioCompra;
	}
	public int getMarchaMax() {
		return marchaMax;
	}
	public void setMarchaMax(int marchaMax) {
		this.marchaMax = marchaMax;
	}
	
	
	
	
	

	}
	
	
	


