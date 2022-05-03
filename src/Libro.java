import java.time.LocalDate;
import java.util.Date;
import static java.time.temporal.ChronoUnit.DAYS;

public abstract class Libro {
    private  String titulo;
    private int ISBN;
    private int cantCapitulos;
    private Estado estado;
    private LocalDate fechaPrestado;
    private Socio socio;

    public void quienLoTiene(    ){
        System.out.println("El libro " + this.titulo + " lo tiene " + this.socio.getNombre());
    }
    public abstract void tiempoPrestamoTotal();

    public abstract void tiempoPrestamoRestante();

    public Estado getEstado() {
        return estado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void setFechaPrestado(Object o) {
        this.fechaPrestado = LocalDate.now();
    }

    public Socio getSocio() {
        return socio;
    }

    public LocalDate getFechaPrestado() {
        return fechaPrestado;
    }

    public Libro(String titulo, int ISBN, int cantCapitulos, Estado estado, LocalDate fechaPrestado, Socio socio) {
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.cantCapitulos = cantCapitulos;
        this.estado = estado;
        this.fechaPrestado = fechaPrestado;
        this.socio = socio;
    }

    public int getISBN() {
        return ISBN;
    }
}
