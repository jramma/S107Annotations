package n1ejercicio2;

public abstract class Trabajador {
	private String nombre;
	private String apellido;
	private int precioHora;

	public Trabajador(String nombre, String apellido, int precioHora) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.precioHora = precioHora;
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

	public int getPrecioHora() {
		return precioHora;
	}

	public void setPrecioHora(int precioHora) {
		this.precioHora = precioHora;
	}

	public abstract void calcularSueldo(int horasTrabajadas);

}
