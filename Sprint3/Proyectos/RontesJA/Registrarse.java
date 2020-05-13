package RontesJA;

public class Registrarse {
	String nombre;
	String apellido;
	String nomusuario;
	String email;
	int fechanaci;
	String contrasena;
	String repetircontrasena;
	
	public Registrarse(String nombre, String apellido, String nomusuario, String email, int fechanaci, String contrasena, String repetircontrasena) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.nomusuario = nomusuario;
		this.email = email;
		this.fechanaci = fechanaci;
		this.contrasena = contrasena;
		this.repetircontrasena = repetircontrasena;
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

	public String getNomusuario() {
		return nomusuario;
	}

	public void setNomusuario(String nomusuario) {
		this.nomusuario = nomusuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getFechanaci() {
		return fechanaci;
	}

	public void setFechanaci(int fechanaci) {
		this.fechanaci = fechanaci;
	}

	private String getContrasena() {
		return contrasena;
	}

	private void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	private String getRepetircontrasena() {
		return repetircontrasena;
	}

	private void setRepetircontrasena(String repetircontrasena) {
		this.repetircontrasena = repetircontrasena;
	}
	public void anadirusuario(String Registrarse) {
		
	}
	private void crearcontrasena (String Registrarse) {
		
	}
}
