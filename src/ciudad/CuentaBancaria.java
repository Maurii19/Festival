package ciudad;

/**@author Mauricio Diaz Araneda
 * 
 * 
 *
 */

public class CuentaBancaria {

	/**
	 * Atributos
	 */
	//atributos
	private String numero;
	private double saldo;
	
	
	
	
	
	public double recarga (double importe){
		return saldo = importe + this.getSaldo();
	}
	
	
	/**
	 * 
	 * @return Obtienes el numero de cuenta de la persona, guardada en un String
	 */
	//getters y setters
	public String getNumero() {
		return numero;
	}

	/**
	 * Asignas el numero de cuenta bancaria a la persona
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}
	/**
	 * 
	 * @return Obtienes el saldo de la cuenta bancaria que tiene la persona
	 */
	public double getSaldo() {
		return saldo;
	}
	/**
	 * 
	 * @param saldo Asignas saldo a la cuenta bancaria que tiene la persona
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
