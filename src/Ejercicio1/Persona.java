package Ejercicio1;

public class Persona {

	private String dni;
	private String nombre;
	private String apellido;
	
	public Persona() {}
	
	public Persona(String dni, String nombre, String apellido) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public boolean verificarDniInvalido(String dni) throws IOException_DniInvalido
	{
		boolean aux = false;
		for(int i = 0; i < dni.length();i++)
		{
			if((int)dni.charAt(i) > 58 || (int)dni.charAt(i) < 47)
			{
				aux = true;
			}
		}
		if(aux == true)
		{
			IOException_DniInvalido exec = new IOException_DniInvalido();
			throw exec;
		}
		else
		{
			return aux;
		}
		
	}

}