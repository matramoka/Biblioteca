import java.time.LocalDate;

public class Informatica extends Libro {
    final static int semanasTopePrestamo = 2;

    public Informatica(String titulo, int ISBN, int cantCapitulos, Estado estado, LocalDate fechaPrestado, Socio socio) {
        super(titulo, ISBN, cantCapitulos, estado, fechaPrestado, socio);
    }

    @Override
    public void tiempoPrestamoTotal() {
        System.out.println("El tiempo de prestamo permitido es de " + semanasTopePrestamo + " semanas");
    }

    @Override
    public void tiempoPrestamoRestante() {
        return;
    }
}
