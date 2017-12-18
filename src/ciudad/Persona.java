package ciudad;

import java.util.ArrayList;
import java.util.Date;

/**@author Mauricio Diaz Araneda
 *
 */
public class Persona {
	
	private String nombre;
	private String apellido;
	private int edad;
	private String telefono;
	private String dni;
	private String poblacion;
	private Date fechaNacimiento;
	private double peso;
	private double dinero;
	private CuentaBancaria cuenta;
	
	
	
	
	//metodos public
	
	
	
	public Persona(){

	}

	
	






	public Persona(String nextLine) {
		// TODO Auto-generated constructor stub
	}









	public CuentaBancaria getCuenta() {
		return cuenta;
	}



	public void setCuenta(CuentaBancaria cuenta) {
		this.cuenta = cuenta;
	}



	/**
	 * 
	 * @return devuelve la edad que cumpliras el año siguiente
	 */
	public int cumplirAnio(){
		this.edad++;
		return getEdad();
	}
	/**
	 * 
	 * @param pesoComido La persona introduce lo que ha comido
	 *  (peso de la comida).
	 */
	public void comer(double pesoComido){
		this.engordar(pesoComido);
		System.out.println("He comido");
	}
	
	/**
	 * 
	 * @param cantidad La persona puede gastar dinero
	 * siempre y cuando su dinero se lo permita.
	 */
	public void gastarDinero(double cantidad){
		if (getDinero() < cantidad){
			System.out.println("Tu presupuesto no te lo permite");
		}else{
			setDinero(getDinero() - cantidad);
			//this.dinero  = this.dinero - cantidad;
		}
	}
	
	/**
	 * Aqui indicamos que es lo que ha comprado la Persona
	 */
	public void comprar(){
		System.out.println("He comprado...");
	}
	/**
	 * 
	 * @param km Se indica cuanto ha corrido en KM y se hace el calculo
	 * del peso para saber cuanto ha bajado.
	 */
	
	public void correr(int minutos){
		//por cada minuto perdera 0.001 gramos
		double pesoPerdido = 0.001*minutos;
		this.peso = this.peso - pesoPerdido;
		System.out.println("He corrido " + minutos +
				" minutos y he perdido " + pesoPerdido+ " kg-s");
	}
	
	public void correr(double km){
		double pesoPerdido = 0.05*km;
		this.peso = this.peso - pesoPerdido;
		
		System.out.println("He corrido " + km +
				" km-s y he perdido " + pesoPerdido+ " kg-s");
	}
	
	/**
	 * @param peso en cuanto se va a cambiar el peso
	 **/
	public void engordar(double peso){
		this.peso = this.peso + peso;
	}
	/**
	 * 
	 * @param edad en cuanto cambiara su edad.
	 */
	public void cambiarEdad(int edad){
		this.edad = edad;
	}

	//getter y setters
	/**
	 * 
	 * @return devuelve el nombre introducido por la persona.
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * 
	 * @param nombre la persona introduce su nombre y se guarda 
	 * en el String nombre.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * 
	 * @return devuelve el apellido introducido por la persona.
	 */
	public String getApellido() {
		return apellido;
	}
	/**
	 * 
	 * @param apellido la persona introduce su apellido y se guarda
	 * en el String apellido.
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	/**
	 * 
	 * @return devuelve la edad introducida por la persona.
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * 
	 * @param edad La persona introduce su edad y se guarda en int edad;
	 * pero tiene que cumplir el parametro que tiene definido.
	 */
	public void setEdad(int edad) {
		if (edad < 0){
			System.out.println("Error en setEdad");
		}else{
			this.edad = edad;
		}
		
	}
	/**
	 * 
	 * @return devuelve el telefono introducido por la persona.
	 */
	public String getTelefono() {
		return telefono;
	}
	/**
	 * 
	 * @param telefono se definen unos requisitos cuando
	 *  la persona introduce su numero
	 */
	public void setTelefono(String telefono) {
		int caracteres = 9;
		if(telefono.length() != 9){
			System.out.println("Introduce un numero valido");
		}else{
			this.telefono = telefono;
		}
		
	}
	/**
	 * 
	 * @return devuelve el dni introducido por la persona
	 */
	public String getDni() {
		return dni;
	}
	/**
	 * 
	 * @param dni La persona introduce su DNI y lo guarda
	 *  en el String dni; tambien se define un requisito 
	 *  la cantidad de caracteres.
	 */
	public void setDni(String dni) {
		if(dni.length() != 9){
			System.out.println("DNI incorrecto");
		
		}else{
			this.dni = dni;
		}
		
	}

	public String getPoblacion() {
		return poblacion;
	}
	/**
	 * 
	 * @param poblacion La persona introduce la poblacion en donde vive y
	 * lo guarda en el String poblacion.
	 */
	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	/**
	 * 
	 * @param fechaNacimiento La persona introduce su fecha de nacimiento.
	 */
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	/**
	 * 
	 * @return devuelve el peso introducido por la persona.
	 */
	public double getPeso() {
		return peso;
	}
	/**
	 * 
	 * @param peso La persona introduce su peso y lo guarda en double peso;
	 * se le define tambien cierto parametro que tiene que cumplir.
	 */
	public void setPeso(double peso) {
		if(peso < 0){
			System.out.println("Peso incorrecto");
		}else{
		this.peso = peso;
		}
	}
	/**
	 * 
	 * @return devuelve el dinero introducido por la persona.
	 */
	public double getDinero() {
		return dinero;
	}
	/**
	 * 
	 * @param dinero La persona introduce cuanto dinero tiene y lo guarda
	 * en un double.
	 */
	public void setDinero(double dinero) {
		this.dinero = dinero;
	}
	
	
	public void mostrarNombreApellido(){
		System.out.println(this.getNombre() + " " + this.getApellido());
		
	}
	
	public String getNombreApellido(){
		return ("Nombre: " + this.getNombre() + " " +  "Apellido: " + this.getApellido() + " " + "Edad: " + this.getEdad());
	}









	public char[] getStringGuardado() {
		// TODO Auto-generated method stub
		return null;
	}




















	
	

	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}//fin clase persona
