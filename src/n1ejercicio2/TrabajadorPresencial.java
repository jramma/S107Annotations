package n1ejercicio2;

public class TrabajadorPresencial extends Trabajador {
	private static float gasolina;

	public TrabajadorPresencial(String nombre, String apellido, int precioHora) {
		super(nombre, apellido, precioHora);

	}

	public float getGasolina() {
		return gasolina;
	}

	public void setGasolina(float gasolina) {
		TrabajadorPresencial.gasolina = gasolina;
	}

	@Override
	public void calcularSueldo(int horasTrabajadas) {
		float sueldo = (float) horasTrabajadas * getPrecioHora() + gasolina;
		System.out.println("Sueldo Trabajador Presencial >> " + sueldo + " euros.");

	}

	@Override
	public String toString() {
		return "TrabajadorPresencial [getNombre()=" + getNombre() + ", getApellido()=" + getApellido()
				+ ", getPrecioHora()=" + getPrecioHora() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	@Deprecated
	public synchronized void delItems(int precio, float gasolina) {
		System.out.println(precio * gasolina);
		System.out.println("esto es un Deprecated en TrabajadorPresencial");
	}
}
