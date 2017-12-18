import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import ciudad.Persona;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		// Scanner scan = new Scanner(System.in);

		// creamos array de 5
		Persona[] personas = new Persona[5];
		// creamos un scan para leer del fichero
		File fichero = new File("D:/nombres.txt");
		Scanner scan = new Scanner(fichero);

		// rellea array con personas
		int i = 0;
		while (scan.hasNextLine()) {
			// leemos la linea
			String linea = scan.nextLine();
			String[] partesPersona = linea.split(",");

			// creamos el objeto persona
			Persona persona = new Persona();
			// le asignamos un nombre
			persona.setNombre(partesPersona[0]);
			// le asignamos un apellido
			persona.setApellido(partesPersona[1]);
			// le asignamos la edad
			persona.setEdad(Integer.parseInt(partesPersona[2]));
			//le asignamos el dinero
			persona.setDinero(Double.parseDouble(partesPersona[3]));

			personas[i] = persona;
			i++;

			// System.out.println("Nombre: " + partesPersona[0] + " Apellido: "
			// + partesPersona[1] + " Edad: "
			// + partesPersona[2]);
			
			System.out.println(persona.getNombreApellido());
			
		}
		System.out.println();
		System.out.println("El primero de la lista es:");
		Persona primera = primeroEnArray(personas);
		primera.mostrarNombreApellido();
		
		System.out.println("La media de la edad es: " + mediaEdad(personas));
		System.out.println("La suma del dinero es: " + sumaDinero(personas));
	}

	private static double sumaDinero(Persona[] personas) {
		double dineroTotal = 0;
		for (int i = 0; i < personas.length; i++){
			dineroTotal = dineroTotal + personas[i].getDinero();
		}
		return dineroTotal;
	}

	private static double mediaEdad(Persona[] personas) {
		double sumaEdad = 0;
		for(int i = 0; i < personas.length; i++){
			
		}
		return sumaEdad = sumaEdad / personas.length;
	}

	private static Persona primeroEnArray(Persona[] personas) {
		Persona primera = personas[0];

		for (int j = 0; j < personas.length; j++) {
			if (personas[j].getApellido().compareTo(primera.getApellido()) < 0) {
				primera = personas[j];
			}

		}
		return primera;

	}

	public static int numeroAleatorio(int min, int max) {
		int numero;
		do {
			numero = (int) ((Math.random() * 100)) % (max + 1);

		} while (!(numero >= min && numero <= max));

		return numero;
	}
}
