import java.time.Duration;
import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class Derecho extends Libro{
    final static int semanasTopePrestamo = 5;
    private LocalDate fechaDev ;
    @Override
    public void tiempoPrestamoTotal() {
        System.out.println("El tiempo de prestamo permitido es de " + semanasTopePrestamo + " semanas");
    }

    public Derecho(String titulo, int ISBN, int cantCapitulos, Estado estado, LocalDate fechaPrestado, Socio socio) {
        super(titulo, ISBN, cantCapitulos, estado, fechaPrestado, socio);
    }

    public void tiempoPrestamoRestante(){
        LocalDate currentDate = LocalDate.now();
        this.fechaDev = currentDate.plusDays(semanasTopePrestamo * 7);
        System.out.println("La fecha de devolucion es: " + this.fechaDev);

        int restantes = (int)Duration.between(this.fechaDev.atStartOfDay(),currentDate).toDays();

        System.out.println(restantes);
        //System.out.println(String.format("The diff of days is "));
    }
}
