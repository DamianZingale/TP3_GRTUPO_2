package Ejercicio1;
import java.io.*;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Archivo {
	
	///PROPIEDAD:
	
	private String ruta;
	
	public boolean existe() {
		File archivo = new File(ruta);
		if(archivo.exists())
			return true;
		return false;
	}
	
	public boolean crearArchivo() {
		FileWriter escritura;
		
		try {
			escritura = new FileWriter(ruta, true);
			escritura.write("");
			escritura.close();
			return true;
		} catch (IOException e) {
			
			e.printStackTrace();
			return false;
		}
		
	}
	
	public void escribirLineas(String frase) {
		try {
			FileWriter entrada = new FileWriter(ruta, true);
			BufferedWriter mibuffer = new BufferedWriter(entrada);
			mibuffer.write(frase);
			mibuffer.close();
			entrada.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public Set<Persona> leerPersonas() throws IOException, IOException_DniInvalido {
		
        Set<Persona> personas = new TreeSet<>(Comparator.comparing(Persona::getApellido)); //PARA QUE NO HAYA DUPLICADOS Y EL TREESET ES PARA ORDENAR
        
        try (FileReader entrada = new FileReader(ruta);
             BufferedReader mibuffer = new BufferedReader(entrada)) {
            
            String linea;
            while ((linea = mibuffer.readLine()) != null) { //EL WHILE HASTA QUE DEVUELVA NULL, COMO DIRIA JUANSE, SIGUE GIRANDO
                String[] datos = linea.split(" - "); //FUNCION PARA DIVIDIR LAS LINEAS
                Persona persona = new Persona(datos[2], datos[0], datos[1]);
                persona.verificarDniInvalido(persona.getDni());
                personas.add(persona);
            }
        }
        return personas;
    		 //EL CATCH SE LO SAQUE POR QUE ME ROMPIA EL CODIGO GG.
	}
	
	/*
	 * FALTA: LEERLINEAS(){}
	 * 
	 * Y EL GET Y SET DE LA RUTA.
	 */

}
