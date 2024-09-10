package Ejercicio1;

public class IOException_DniInvalido extends Exception{
	
	//CONSTRUCTOR
	public IOException_DniInvalido() {}
	
	//SOBREESCRITURA METODO GETMESSAGE
	@Override
	public String getMessage() {
		
		return "DNI invalido --solo numeros--";
	}
	
	
}
