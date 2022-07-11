package n1ejercicio2;

public class TrabajadorOnline extends Trabajador {

	private final float precioTarifaPlana = (float) 50.99;

	public TrabajadorOnline(String nombre, String apellido, int precioHora) {
		super(nombre, apellido, precioHora);
		// TODO Auto-generated constructor stub
	}

	public float getPrecioTarifaPlana() {
		return precioTarifaPlana;
	}

	@Override
	public void calcularSueldo(int horasTrabajadas) {
		float sueldo = (float) horasTrabajadas * getPrecioHora() + precioTarifaPlana;
		System.out.println("Sueldo Trabajador Online >> " + sueldo + " euros.");

	}

	@Override
	public String toString() {
		return "TrabajadorOnline [precioTarifaPlana=" + precioTarifaPlana + "]";
	}

	@Deprecated
	public final void stop() {
		synchronized (this) {
			System.out.println("Esto es un Deprecated en Trabajador Online");
		}
	}

}
