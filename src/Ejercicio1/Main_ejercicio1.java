package Ejercicio1;

import java.io.IOException;
import java.util.Set;

public class Main_ejercicio1 {

	public static void main(String[] args) {
		
		Archivo file = new Archivo();

		file.setRuta("personas.txt");

		if(!file.existe()){
			System.out.println("No se ha encontrado el archivo");
			return;
		}

		try {
        
            Set<Persona> personas = file.leerPersonas();
            
            file.setRuta("personas.txt");
            
            for (Persona persona : personas) {
                String linea = persona.getDni() + " - " + persona.getApellido() + " - " + persona.getNombre();
                file.escribirLineas(linea + "\n");
            }
            
            System.out.println("La información se ha escrito correctamente en 'personas.txt'.");
        } catch (IOException | IOException_DniInvalido e) {
            System.out.println("Error al procesar el archivo: " + e.getMessage());
        }

	}

}
