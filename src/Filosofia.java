import java.time.LocalDate;

public class Filosofia extends Libro{

    final static int semanasTopePrestamo = 2;

    public Filosofia(String titulo, int ISBN, int cantCapitulos, Estado estado, LocalDate fechaPrestado, Socio socio) {
        super(titulo, ISBN, cantCapitulos, estado, fechaPrestado, socio);
    }

    public void tiempoPrestamoTotal() {
        System.out.println("El tiempo de prestamo permitido es de " + semanasTopePrestamo + " semanas");
    }


    @Override
    public void tiempoPrestamoRestante() {
        return;
    }
}
