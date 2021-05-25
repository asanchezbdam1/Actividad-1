
public class TestPeriodo {

	public static void main(String[] args) {
		CalcularPeriodo.calcularPeriodo("Normandía", java.time.LocalDate.of(1944, 6, 6));
		CalcularPeriodo.calcularPeriodo("Nuevo milenio", java.time.LocalDate.of(2000, 1, 1));
		CalcularPeriodo.calcularPeriodo("Nacimiento de un tal Jesús o algo", java.time.LocalDate.of(0, 1, 1));
	}

}
