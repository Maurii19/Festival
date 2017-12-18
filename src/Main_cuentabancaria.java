import ciudad.CuentaBancaria;

public class Main_cuentabancaria {

	public static void main(String[] args) {
		CuentaBancaria mauricio = new CuentaBancaria();
		
		mauricio.setSaldo(10);
		
		System.out.println("Tu saldo actual es: " + mauricio.getSaldo());
	
		double importe = mauricio.recarga(100);
		
		System.out.println("Ahora tienes: " + mauricio.getSaldo());

	}

}
