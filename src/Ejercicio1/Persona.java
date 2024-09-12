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
		
		// funcion lambda para verificar que el parametro de esa funcion 'c' no sea un digito. 
		//Devuelve true si uno de los caractéres no es un digito y salta la excepcion.
		if(dni.chars().anyMatch(c -> !Character.isDigit(c)))
		{
			
			throw new IOException_DniInvalido();	
		}
		else{

			return false;
		}
		
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (apellido == null) {
			if (other.apellido != null)
				return false;
		} else if (!apellido.equals(other.apellido))
			return false;
		return true;
	}

	
		
		
		

		/*for(int i = 0; i < dni.length();i++)
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
		}*/
		

}
