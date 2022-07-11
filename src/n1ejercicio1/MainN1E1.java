package n1ejercicio1;

public class MainN1E1 {

	public static void main(String[] args) {
		// argumentos de las dos clases> nombre, apellido, precioHora:
		TrabajadorPresencial trabajador1 = new TrabajadorPresencial("Juan", "Antonio", 15);
		TrabajadorOnline trabajador2 = new TrabajadorOnline("Elon", "Musk", 7);

		trabajador1.setGasolina((float) 2.9);
		// metodos con Override funcionando en sendas clases>>
		trabajador1.calcularSueldo(240);
		trabajador2.calcularSueldo(180);

	}

}
