import java.time.LocalDate;

public class Economia extends Libro{
    final static int semanasTopePrestamo = 5;

    @Override
    public void tiempoPrestamoTotal() {
        System.out.println("El tiempo de prestamo permitido es de " + semanasTopePrestamo + " semanas");
    }

    public Economia(String titulo, int ISBN, int cantCapitulos, Estado estado, LocalDate fechaPrestado, Socio socio) {
        super(titulo, ISBN, cantCapitulos, estado, fechaPrestado, socio);
    }

    @Override
    public void tiempoPrestamoRestante() {
        return;
    }
}
