package n1ejercicio2;

public class MainDeprecated {
	// Warning para indicar que se van a ejecutar metodos absoletos:
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		TrabajadorPresencial trabajador1 = new TrabajadorPresencial("Juan", "Antonio", 15);
		TrabajadorOnline trabajador2 = new TrabajadorOnline("Elon", "Musk", 7);

		trabajador1.delItems(4, 0);
		trabajador2.stop();

	}

}
